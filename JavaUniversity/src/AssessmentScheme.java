import java.util.ArrayList;

public class AssessmentScheme {
	
	
	private ArrayList<Assessment> assessmentList;
	
	public AssessmentScheme() {
		assessmentList = new ArrayList<Assessment>();
	}
	
	public void addAssessment(Assessment assessment) {
		assessmentList.add(assessment);
		
	}
	
	
	public ArrayList<Assessment> getAssessmentSchemeList() {
		
		return assessmentList;
		
	}
	

	public void printAssessment() {
		for(int i = 0;i<assessmentList.size();i++) {
			System.out.println(assessmentList.get(i).description());

		}
	
	
	}
}
