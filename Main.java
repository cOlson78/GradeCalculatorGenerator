import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		//Creates Scanner input and printstream output
		Scanner input = new Scanner(System.in);
		PrintStream output = new PrintStream(new File("Output.java"));
		
		//Start of file contents
		output.println("public class Output {");
		output.println("\tpublic static void main(String[] args) {");
		
		//Ask user for class name
		System.out.println("Please put in the name of your class you want this grade calculator for:");
		String className = input.nextLine();
		
		//Adds a comment in the file
		output.println("\t\t//Grade calculator for " + className + "\n");
		
		//Gets number of grading components
		System.out.println("How many components (midterm, quizzes, exams, etc.) are part of this class?");
		String numComps = input.nextLine();
		int numCompsInt = Integer.parseInt(numComps);

		//Stores variables to the console
		for(int i = 0; i < numCompsInt; i++) {
			System.out.print("What is the name of component " + (i + 1) + "? ");
			String compName = input.nextLine();
			
			//Output variables to the file
			output.println("\t\tdouble comp" + (i + 1) + " = 0; //" + compName);
		}
		
		//Creates an array for the grading components
		double[] arr = new double[numCompsInt];
		
		//Asks for percentages of the components
		for(int i = 0; i < numCompsInt; i++) {
			System.out.print("What percentage of the grade is component " + (i + 1) + " (use whole numbers)? ");
			String compPercIn = input.nextLine();
			
			//Divide the percentage by 100 to get it in decimal form
			double compPerc = Double.parseDouble(compPercIn) / 100;
			
			//Assign it to the array
			arr[i] = compPerc;
		}
		
		//Grade calculation part:
		output.print("\n\t\tdouble grade = ");
		for(int i = 0; i < numCompsInt; i++) {
			if(i == numCompsInt - 1) {
				output.println("(comp" + (i + 1) + " * " + arr[i] + ");\n");
			} else {
				output.print("(comp" + (i + 1) + " * " + arr[i] + ") + ");
			}
		}
		
		//End by printing it out and adding closing brackets
		output.println("\t\tSystem.out.println(grade);");
		output.println("\t}");
		output.println("}");

		//Final message to console
		System.out.println("The grade calculator file has been saved to Output.java.");
		
		//Close scanner and printstream
		input.close();
		output.close();

	}

}
