/**
 * Implements a class Mark with a complusory mark and and optional comment.
 * 
 * @author Saauren Mankad
 *
 */
public class Mark {
	
	private double mark;
	private String comment;
	
	/**
	 * Constructor to create a new Mark object, where no comment is inputted.
	 * 
	 * The comment attribute will by default be set to an empty string and the mark
	 * attribute will be set as according to newMark.
	 * 
	 * The newMark must be a numerical value of type double, and must be in between
	 * 0 and 100 inclusive
	 * 
	 * @param newMark
	 */
	public Mark(double newMark){
		checkMark(newMark);
		mark = newMark;
		comment = "";
		
	}
	
	
	/**
	 * Constructor to create a new Mark object, where no comment is inputted.
	 * 
	 * The comment attribute will be set to newComment and the mark
	 * attribute will be set as according to newMark.
	 * 
	 * The newMark must be a numerical value of type double, and must be in between
	 * 0 and 100 inclusive. This constructor calls checkMark(newMark) to check that
	 * this condition holds true.
	 * 
	 * The newComment must be of String type.
	 * 
	 * @param newMark
	 */
	public Mark(double newMark,String newComment){
		checkMark(newMark);
		mark = newMark;
		comment = newComment;
		
	}
	
	/**
	 * This function checks the input numerical newMark of type double to ensure that the newMark
	 * is in the range from 0 to 100 inclusive.
	 * 
	 * @param newMark
	 */
	private void checkMark(double newMark) {
		// this method ensures DRY maintained as validation does not need to be copy pasted for
		// both constructors
		if (newMark > 100 || newMark < 0) {
			throw new IllegalArgumentException("The Mark must be in the range 0 to 100 inclusive");
		}

	}
	
	/**
	 * Returns the attribute of mark for the Mark object
	 * @return mark
	 */
	public double getMark() {
		return mark;
	}
	
	/**
	 * Returns the comment attribute for the Mark object
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * Implements a method that returns the description of the Mark
	 * which includes the mark attribute and the comment attribute.
	 * @return description
	 */
	public String description() {
		String description;
		
		description = "Mark: " + mark + " Comment " + comment;
		
		return description;
	}
}
