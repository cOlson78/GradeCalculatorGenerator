public class SampleOutput {
	public static void main(String[] args) {
		//Grade calculator for CS495: Systems Programming

		double comp1 = 0; //Participation
		double comp2 = 0; //Labs
		double comp3 = 0; //Homework
		double comp4 = 0; //Midterm
		double comp5 = 0; //Final Exam
		double comp6 = 0; //Group Project

		double grade = (comp1 * 0.1) + (comp2 * 0.25) + (comp3 * 0.2) + (comp4 * 0.15) + (comp5 * 0.1) + (comp6 * 0.2);

		System.out.println(grade);
	}
}
