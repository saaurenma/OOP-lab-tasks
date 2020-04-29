/**
 * Implements a child class {@code Assignment} of the abstract class {@code Assessment} 
 * Each assignment has a title attribute that defines the name of the assignment.
 * @author Saauren Mankad
 *
 */
public class Assignment extends Assessment{
	
	private String title;
	
	/**
	 * Constructor to create an Assignment object takes in an integer weight and the title of the
	 * assignment.
	 * 
	 * @param newWeight
	 * @param newTitle
	 */
	public Assignment(int newWeight, String newTitle) {
		
		title = newTitle;
		super.setWeight(newWeight);
		
	}
	
	
	/**
	 * Implements the abstract method {@code description} from the parent class Assseessment to return the description
	 * of an Assignment.
	 */
	public String description() {
		
		String description;
		
		description = "Assignment: " + title + ", weight " + weight + "%";
		
		return description;
		
	}
	
	
	
}
