import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class University {
	
	
    private ArrayList<Unit> units;
    
    public University() {
    	units = new ArrayList<Unit>();
    }
	
	private void createUnits() {
		
        Unit unit1 = new Unit("FIT1234","Advanced Bogosorts");
        Unit unit2 = new Unit("FIT2027","Introduction to Spaghetti Coding");
        Unit unit3 = new Unit("FIT3456","Enterprise Fizzbuzz");
        
		units.add(unit1);
		units.add(unit2);
		units.add(unit3);
		
		for (Unit currentUnit: units) {
			
			System.out.println("Entering students for " + currentUnit.description());
			
			boolean addStudents = true;
			
			String nextUnit = readString("Press enter to enroll new student, and type anything to go to next unit: ");
			
			if (!nextUnit.equals("")) {
				addStudents = false;
			}
					
			while (addStudents == true) {
				String newStudentId = readString("Enter a student id: ");
				String newGivenName = readString("Enter a student given name:");
				String newFamilyName = readString("Enter a student surname: ");

				Student newStudent = new Student(newStudentId, newGivenName, newFamilyName);
				
				currentUnit.enrolStudent(newStudent);
				
				nextUnit = readString("Press enter to enroll new student, and type anything to go to next unit: ");

				
				if (!nextUnit.equals("")){
					addStudents = false;
				}
				
				System.out.println("");
				
						
				}
			}
				
			
		}
		
	
	
	private void displayUnits() {
		
		
        for (int i = 0; i < units.size(); i++) {
            System.out.println("");

        	Unit currentUnit = units.get(i);
    
            String description = currentUnit.description();
            System.out.println(description);
            System.out.println("Enrolled Students:");
            
            ArrayList<Student> studentsEnrolled = currentUnit.getStudents();
            
            for (Student currentStudent: studentsEnrolled) {
            	 
            	System.out.println(currentStudent.description());
            	
            	}
            
        }
        
	}

    public void printStatus() {     
    	// this method prints out the welcome and goodbye statements
    	// and also calls the methods to create and display units
    	
        System.out.println("Welcome to Java University");
        createUnits();
        displayUnits();
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
