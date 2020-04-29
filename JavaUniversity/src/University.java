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
    	
    	Assignment myAssignment = new Assignment(40,"PYTHON ASSIGNMENT");
    	Exam myExam = new Exam(60,100);
    	ArrayList<Assessment> myArrayList = new ArrayList<Assessment>();
    	myArrayList.add(myExam);
    	myArrayList.add(myAssignment);
    	
    	
    	AssessmentScheme myAssessmentScheme = new AssessmentScheme(myArrayList);
    	myUnit.setAssessmentScheme(myAssessmentScheme);
    	
    	Mark myMark2 = new Mark(65);
       	Student myStudent2 = new Student("12345678","John","Doe");
    	Student myStudent3 = new Student("12365474","Jimmy","Jones");
    	
    	myUniversity.admitStudent(myStudent2);
    	myUniversity.admitStudent(myStudent3);

    	
    	myUnit.enrolStudent("12345678");
    	myUnit.enrolStudent("12365474");
    	


    	myUnit.printAssessmentScheme();
    	
    	myExam.addMark(myStudent2, myMark2);
    	
    	Mark myMark3 = new Mark(80,"nice");
    	Mark myMark4 = new Mark(44);
    	myExam.addMark(myStudent3, myMark3);
    	myAssignment.addMark(myStudent3, myMark4);
    	
    	System.out.println(myUnit.getStudentMark(myStudent3));

    
    	
    	HashMap<String, Mark> myMarks = myExam.getMarks();

    	for (Map.Entry<String, Mark> entry : myMarks.entrySet()) {
    	    System.out.println(entry.getKey()+" : "+entry.getValue().getMark());
    	}
    	
    	HashMap<String, Mark> myMarks2 = myAssignment.getMarks();

    	for (Map.Entry<String, Mark> entry : myMarks2.entrySet()) {
    	    System.out.println(entry.getKey()+" : "+entry.getValue().getMark());
    	}    	
    	
    	
    	System.out.println(myUnit.checkIfStudentCompleted(myStudent3));
    	
    	
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
