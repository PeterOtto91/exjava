import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NumberFormatException;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class ExD2 {
	
	
	public static void main(String[] args) {
		
		try {
			
			
			String courseLabel;
		
			Scanner title = new Scanner(System.in);
			System.out.println ("Title?");
		
			String titleOfCourse = title.nextLine();
		
			Scanner numberOfDays = new Scanner(System.in);
			System.out.println ("Number of days?");
		
			int numberOfDaysofCourse = Integer.parseInt(numberOfDays.nextLine());
		
		
		
			Scanner pricePerDay = new Scanner(System.in);
			System.out.println ("Price per Day?");
		
			double pricePerDayOfCourse = Double.parseDouble(pricePerDay.nextLine());
		
		
			boolean knowledgeRequiredForCourse = true;
			ArrayList<String> instructorsOfCourse = new ArrayList<String>();
		
			instructorsOfCourse.add ("Jan");
			instructorsOfCourse.add ("Wim");
			instructorsOfCourse.add ("Dirk");
		
			double totalPrice = calculateTotalPrice(numberOfDaysofCourse, pricePerDayOfCourse, knowledgeRequiredForCourse);
		
		
			if (totalPrice < 500){
			
				courseLabel = "Cheap";
			}
			else if (totalPrice > 1500) {
			
				courseLabel = "Expensive";
			}
			else {
				courseLabel = "OK";
			}
		
		
			printInfo(titleOfCourse, numberOfDaysofCourse, pricePerDayOfCourse, knowledgeRequiredForCourse, instructorsOfCourse.size(), totalPrice, courseLabel);
		}
		catch(NumberFormatException e) {
			
			System.out.println ("Not Numeric, please run again with correct value.");
		}
		
	}
	
	
	public static void printInfo(String titleIn, int daysIn, double priceIn, boolean knowledgeIn, int instructorsIn, double totalIn, String labelIn) {
		
		try {
			BufferedWriter bw = null;
		
			File outputFile = new File("courseinfo.txt");
		
			FileWriter myWriter = new FileWriter("courseinfo.txt");
			bw = new BufferedWriter(myWriter);
		
			bw.write (titleIn + " " + daysIn + " " + priceIn + " " + knowledgeIn);
			bw.newLine();
			bw.write ("Number of instructors = " + instructorsIn);
			bw.newLine();
			bw.write ("Price of Course = " + totalIn);
			bw.newLine();
			bw.write ("The price appears to be " + labelIn);
		
			bw.close();
			myWriter.close();
		
			System.out.println (titleIn + " " + daysIn + " " + priceIn + " " + knowledgeIn);
			
			System.out.println ("Number of instructors = " + instructorsIn);
			System.out.println ("Price of Course = " + totalIn);
			System.out.println ("The price appears to be " + labelIn);
		}
		
		catch(IOException e) {
			System.out.println ("IO erro");
		}
		
	}
	
	
	public static double calculateTotalPrice (int numDays, double priceDay, boolean knowledge) {
	
		double priceOfCourse = numDays * priceDay;
		double totalPriceOfCourse = 0;
		
		if ((numDays > 3) && (knowledge)) {
			totalPriceOfCourse = priceOfCourse;
		}
		else {
			totalPriceOfCourse = priceOfCourse + (priceOfCourse / 100 * 21);
		}
		
		return totalPriceOfCourse;
	
	}
	
}