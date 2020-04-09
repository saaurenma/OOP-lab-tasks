import java.util.ArrayList;

public class Unit {
	/*
	 I have used an ArrayList to hold the students enrolled in a unit.
	 
	 This is because native java arrays do not allow us to change the length of the array
	 once it has been created, but the length of an ArrayList is dynamic meaning that we do
	 not have to adjust the length every time a student is enrolled (or unenrolled if implemented
	 in the future).
	 
	 In this manner, ArrayList means that there is no unnecessary processing 
	 to change the length each time a student is added to a unit. This also means
	 it is easier for other developers to read and understand the code.
	 
	*/
	
    private ArrayList<Student> students = new ArrayList<Student>();
    private String code;
    private String name;
    
    public Unit(String newCode, String newName) {
    	
    	code = newCode;
    	name = newName;
    	
    }
    
    
    public void enrolStudent(Student newStudent) {
    	
    	students.add(newStudent);
    	
    }
    
    public ArrayList<Student> getStudents() {
    	return students;
    }
	
    
    public String description() {
    	
    	String unitDescription = code + " " + name;
    	
        return unitDescription;
    }
	
}
