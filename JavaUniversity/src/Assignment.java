
public class Assignment extends Assessment{
	
	String title;

	public Assignment(int newWeight, String newTitle) {
		
		title = newTitle;
		weight = newWeight;
		
	}

	public String description() {
		
		String description;
		
		description = "Assignment: " + title + ", weight " + weight + "%";
		
		return description;
		
	}
	
	
	
}
