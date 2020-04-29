import java.util.HashMap;


/**
 * Implements an abstract class {@code Assessment} which consists 2 child classes
 * {@code Exam} and {@code Assignment}.
 * @author Saauren Mankad
 *
 */
public abstract class Assessment {
	
	
	protected int weight;
	HashMap<String, Mark> marks = new HashMap<String, Mark>();
	
	/**
	 * Sets the weight of the Assessment.
	 * 
	 * This newWeight must be in the range from 1 to 100 inclusive.
	 * @param newWeight
	 */
	public void setWeight(int newWeight) {
		
		if (newWeight < 1) {
			throw new IllegalArgumentException("Weight must be at least 1%");
		}
		
		if (newWeight > 100) {
			throw new IllegalArgumentException("Weight must be at lower than or equal to  100%");
			
		}	
		
		weight = newWeight;
		
	}
	
	/**
	 * Returns the weight of the Assessment
	 * @return weight
	 */
	public int getWeight() {
		
		return weight;
		
	}
	
	
	/**
	 * Adds a newMark for a certain student.
	 * This method will add the {@code studentId} of the student as the key
	 * and the {@code newMark} as the value hence adding {@code (studentId, newMark)} as (key, value)
	 * pairs to the HashMap.
	 * 
	 * @param student
	 * @param newMark
	 */
	public void addMark(Student student, Mark newMark) {
		
		String studentId = student.getStudentId();
		
		marks.put(studentId, newMark);
	}
	
	/**
	 * Returns the HashMap consisting of the mark for each studentId
	 * @return marks
	 */
	public HashMap<String, Mark> getMarks() {
		return marks;
	}
	
	/**
	 * Abstract method of description which is implemented by child classes Exam and Assignment.
	 * @return
	 */
	public abstract String description();


}
