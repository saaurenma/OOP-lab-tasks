/**
 * Implements a child class {@code Exam} of the abstract class {@code Assessment} 
 * Each exam has a duration attribute that defines how long the exam will go for.
 * @author Saauren Mankad
 *
 */
public class Exam extends Assessment{
	
	private int duration;
	
	/**
	 * Constructor to instantiate a new Exam object.
	 * The duration must be in the range from 30 to 180 minutes inclusive.
	 * The {@code newWeight} must be in the range from 1 to 100 inclusive.
	 * 
	 * @param newWeight
	 * @param newDuration
	 */
	public Exam(int newWeight, int newDuration) {
		
		if (newDuration < 30) {
			throw new IllegalArgumentException("Exam duration too short");
		}
		
		if (newDuration > 180) {
			throw new IllegalArgumentException("Exam duration too long");
		}
		
		
		duration = newDuration;
		super.setWeight(newWeight);
	}

	/**
	 * Implements the abstract method {@code description} from the parent class Assseessment to return the description
	 * of an Exam.
	 */
	public String description() {
		
		String description;
		
		description ="Exam: duration " + duration + " minutes, weight " + weight + "%";
		
		
		return description;
		
	}
	
}
