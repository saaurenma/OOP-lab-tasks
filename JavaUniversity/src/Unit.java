import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Unit {
	
	/*
	 * Set will by nature make sure that duplicate student ids are not entered
	 */
    Set<String> enrolledStudents = new HashSet<String>(); 
	private AssessmentScheme assessmentScheme = new AssessmentScheme();

	private String code;
    private String name;

    
    public Unit(String newCode, String newName) {
    	
    	code = newCode;
    	name = newName;	
    }
   
    
    public void addAssessmentScheme(Assessment assessment) {
    	
    	assessmentScheme.addAssessment(assessment);
    	
    }
    
    public void printAssessmentScheme() {
    	assessmentScheme.printAssessment();
    }
    
    // made public so can test in uni
    public boolean checkIfStudentCompleted(Student student) {
    	
        boolean hasCompleted = false;
        String studentId = student.getStudentId();
        if (!enrolledStudents.contains(studentId)) {
        	// the student is not enrolled in the unit, so they have not completed the asesement
        	return hasCompleted;
        }
        
        else {
        	
        	
        	ArrayList<Assessment> assessments = assessmentScheme.getAssessmentSchemeList();
        	
        	int numberAssessments = assessments.size();
        	int studentAssessments = 0;
        	
        	for(Assessment assessment : assessments) {
        		
        		HashMap<String, Mark> allMarks = assessment.getMarks();
        		// look up the student in the marks for each assessment
        		if (allMarks.get(studentId) != null) {
        			studentAssessments++;
        		}
        		
        	}
        	
        	if (studentAssessments == numberAssessments) {
        		hasCompleted = true;
        	}
        	
        }

    	return hasCompleted;
    }
    

    
    public void enrolStudent(String admittedStudentId) {
    	
    	enrolledStudents.add(admittedStudentId);
    	
    }
    
    

    public Student[] getStudents(University university) {
    	
    	
    	Student students[] = new Student[enrolledStudents.size()];
    	
    	int i = 0;
    	
    	// loop through the enrolled students
        for (String student : enrolledStudents) {
        	// lookup studentid in hashmap
            Student currentStudent = university.getStudentById(student);
            students[i] = currentStudent;
            i++;
         }    	
    	
    	return students;
    }
	
    
    public String description() {
    	
    	String unitDescription = code + " " + name;
    	
        return unitDescription;
    }
	
}
