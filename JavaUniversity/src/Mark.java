
public class Mark {
	
	private double mark;
	private String comment;
	
	public Mark(double newMark){
		checkMark(newMark);
		mark = newMark;
		comment = "";
		
	}
	
	public Mark(double newMark,String newComment){
		checkMark(newMark);
		mark = newMark;
		comment = newComment;
		
	}
	
	private void checkMark(double newMark) {
		// this method ensures DRY maintained as validation does not need to be copy pasted for
		// both constructors
		if (newMark > 100 || newMark < 0) {
			throw new IllegalArgumentException("The Mark must be in the range 0 to 100 inclusive");
		}

	}
	
	public double getMark() {
		return mark;
	}
	
	public String getComment() {
		return comment;
	}

	public String description() {
		String description;
		
		description = "Mark: " + mark + " Comment " + comment;
		
		return description;
	}
}
