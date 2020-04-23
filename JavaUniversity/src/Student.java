
public class Student {
	
	/*
	I have used a string for studentId, because in java, the int type can only hold
	whole numbers up to 2147483647 meaning that we are limited in terms of length options for id,
	whereas a string means that we are able to have a length up to 2,147,483,647 characters,
	which is more than enough room to expand our id system.
	
	The String datatype also means we can concatenate a letter at the beginning of the id
	if the University has multiple campuses, for example C###### for Clayton and M###### for
	Malaysia.

	*/
    private String studentId;
    
    /*
     
     givenName and familyName are used instead of firstName and lastName
     as people from some countries have a family name followed by their given name,
     and therefore firstName and lastName may be confusing for a developer or user of this
     system. Using givenName and familyName is more clear and therefore reduces this confusion.
     
     */
    private String givenName;
    private String familyName;
    
    public Student(String newStudentId) {
    	studentId = newStudentId;
    	
    }
    
    public Student(String newStudentId, String newGivenName, String newFamilyName) {
    	
        studentId = newStudentId;
        givenName = newGivenName;
        familyName = newFamilyName;
    	
    }
    
    public String getStudentId() {
    	return studentId;
    }
    
    public void setGivenName(String newGivenName) {
    	
    	givenName = newGivenName;
    	
    }
    
    public void setFamilyName(String newFamilyName) {
    	
    	familyName = newFamilyName;
    	
    }
    

    
    public String description() {
    	
    	String description = studentId + " " + givenName + " " +  familyName;
    	
    	return description;
    }
    
    

}
