
public class Exam extends Assessment{
	
	private int duration;
	
	public Exam(int newWeight, int newDuration) {
		
		duration = newDuration;
		weight = newWeight;
	}

	
	public String description() {
		
		String description;
		
		description ="Exam: duration " + duration + " minutes, weight " + weight + "%";
		
		
		return description;
		
	}
	
}
