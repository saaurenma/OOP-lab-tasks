import java.util.HashMap;

public abstract class Assessment {
	
	protected int weight;
	HashMap<String, Mark> marks = new HashMap<String, Mark>();
	
	public void setWeight(int newWeight) {
		
		weight = newWeight;
		
	}
	
	public int getWeight() {
		
		return weight;
		
	}
	
	public void addMark(Student student, Mark newMark) {
		
		String studentId = student.getStudentId();
		
		marks.put(studentId, newMark);
	}
	
	public HashMap<String, Mark> getMarks() {
		return marks;
	}
	

	public abstract String description();


}
