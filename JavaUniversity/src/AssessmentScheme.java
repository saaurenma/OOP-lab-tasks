import java.util.ArrayList;

public class AssessmentScheme {
	
	
	private ArrayList<Assessment> assessmentList;
	
	
	public AssessmentScheme(ArrayList<Assessment> newAssessments) {
		
		double weightSum = 0;
		for (Assessment assessment : newAssessments)
			weightSum += assessment.getWeight();
		
		if (weightSum != 100) {
			throw new IllegalArgumentException("Sum of weights in AssessmentScheme must equal 100");
		}
	
		assessmentList = newAssessments;
	}
	

	
	
	// add deep copy constructor, create new mark object for each
	// iteration of assessment
	
	public ArrayList<Assessment> getAssessmentSchemeList() {
		// privacy leak here
		return assessmentList;
		
	}
	

	public void printAssessment() {
		for(int i = 0;i<assessmentList.size();i++) {
			System.out.println(assessmentList.get(i).description());

		}
	
	
	}
}
