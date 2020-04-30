import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Course {
	ArrayList<Unit> coreUnits;
	static double PASS_GRADE = 50;
	
	
	// the number of electives required to pass
	int electiveNumReq;
	
	public Course(int newElectiveNumReq, ArrayList<Unit> newCoreUnits) {
		
		electiveNumReq = newElectiveNumReq;
		coreUnits = newCoreUnits;
	}
	
	public void addUnitToCourse(Unit unit) {
		coreUnits.add(unit);
		
		
	}
	
	public ArrayList<Unit> getCoreUnits(){
		
		ArrayList<Unit> newList = new ArrayList<Unit>();
		
		for(Unit unit : coreUnits) {
		    newList.add(unit);
		}
		
		return newList;
	}
	
	public ArrayList<Student> getEligibleStudents(University university) {
		
	
    	for(Unit unit : coreUnits) {
    		Set<String> enrolledStudents = unit.getEnrolledStudents();
    		
    		for(String studentId : enrolledStudents) {
    			Student student = university.getStudentById(studentId);
    			if (unit.checkIfStudentCompleted(student)) {
    				double mark = unit.getStudentMark(student);
    				if (mark <= PASS_GRADE) {
    					
    				}
    			}
    		}
    		
    	}
		return null;
		
	
	}
	
	

	

}
