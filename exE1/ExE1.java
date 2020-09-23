import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.NumberFormatException;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class ExE1 {
	
	
	public static void main(String[] args) {
		
		try {
			
			
			String courseLabel;
		
			Scanner firstN = new Scanner(System.in);
			System.out.println ("First Name?");
			String firstName = firstN.nextLine();
			
			Scanner lastN = new Scanner(System.in);
			System.out.println ("Last Name?");
			String lastName = lastN.nextLine();
			
			Scanner age = new Scanner(System.in);
			System.out.println ("Age?");
			int ageNumeric = Integer.parseInt(age.nextLine());
		
			
			HashMap<String, Integer> instructorStart = new HashMap<String, Integer>();
		
			instructorStart.put("Wim", 31);
			instructorStart.put("Alain", 25);
			instructorStart.put("Geert", 50);

			int startDate = instructorStart.get(firstName);


			HashMap<String, Integer> instructorSalary = new HashMap<String, Integer>();
		
			instructorSalary.put("Wim", 2200);
			instructorSalary.put("Alain", 2000);
			instructorSalary.put("Geert", 2300);

			int salary = instructorSalary.get(firstName);
			
			printSalaryHistory(firstName, ageNumeric, startDate, salary);
			
		
		}
		catch(NumberFormatException e) {
			
			System.out.println ("Not Numeric, please run again with correct value.");
		}
		
	}
	
	
	public static void printSalaryHistory(String firstNameIn, int ageIn, int startIn, double salaryIn) {
		
		try {
			
			int limitI = ageIn;
			double salaryUp = salaryIn; 
			
			BufferedWriter bw = null;
			File outputFile = new File("salaryhistory.txt");
			FileWriter myWriter = new FileWriter("salaryhistory.txt");
			bw = new BufferedWriter(myWriter);
			
			for (int i=startIn; i < limitI; i+=5) {
				
				salaryUp = salaryUp * 1.03;
				
				bw.write ("Salary of " + firstNameIn + " at " + i + " is " + salaryUp);
				bw.newLine();
				if (i > (startIn +35)) {
					bw.write ("Maximum Salary Reached");
					break;
				}
			}
			
		
			bw.close();
			myWriter.close();
		
		}
		
		catch(IOException e) {
			System.out.println ("IO error");
		}
		
	}
	
	
	
}