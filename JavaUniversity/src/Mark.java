
public class Mark {
	private double mark;
	private String comment;
	
	public Mark(double newMark){
		mark = newMark;
		comment = "";
		
	}
	
	public Mark(double newMark,String newComment){
		mark = newMark;
		comment = newComment;
		
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
