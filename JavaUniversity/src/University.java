import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class University {
	
	
    private ArrayList<Unit> units;
    private HashMap<String, Student> students = new HashMap<String, Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();
    
    public University() {
    	units = new ArrayList<Unit>();
    }
    
    private void admitStudent(Student newStudent) {
    	
    	students.put(newStudent.getStudentId(), newStudent);
    }
    
    
	

	public Student getStudentById(String studentId) {
		
		Student student = students.get(studentId);
		
		return student;
	}
	
	


    public void test() {
    	
    	University myUniversity = new University();
    	
    	
    	Unit myUnit = new Unit("FIT1234","Intro to Programming");
    	units.add(myUnit);
    	
    	try {
    		//test exam duration exception
    		Exam myExam2 = new Exam(60,10);
    	}
    	catch(IllegalArgumentException e){
    		System.out.println(e);
    	}
    	
    	try {
    		Exam myExam2 = new Exam(60,190);
    	}
    	catch(IllegalArgumentException e){
    		System.out.println(e);
    	}
    	
    	
    	try {
    		Assignment myAssignment = new Assignment(0,"PYTHON ASSIGNMENT");
    	}
    	catch(IllegalArgumentException e){
    		System.out.println(e);
    	}
    	
    	try {
    		Assignment myAssignment1 = new Assignment(20,"PYTHON ASSIGNMENT");
    		Exam myExam1 = new Exam(20,150);
    		ArrayList<Assessment> myScheme = new ArrayList<Assessment>();
    		myScheme.add(myExam1);
    		myScheme.add(myAssignment1);

    		
    		AssessmentScheme myAssignmentScheme = new AssessmentScheme(myScheme);
    		
    	}
    	catch(IllegalArgumentException e){
    		System.out.println(e);
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    	
    public void printStatus() {     
    	// this method prints out the welcome and goodbye statements
    	// and also calls the methods to create and display units
    	
        System.out.println("Welcome to Java University");
        //createUnits();
        //displayUnits();
        test();
        System.out.println("Thank you for using Java University");

    }
    
    private String readString(String prompt) {
    	System.out.print(prompt);
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	String s = null;
    	try {
    		
    		s = in.readLine();
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	return s;
    }

    
}
