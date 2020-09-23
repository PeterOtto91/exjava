import java.util.ArrayList;
import java.util.Scanner;

public class ExC1 {
	
	
	public static void main(String[] args) {
		
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
		
		double priceOfCourse = numberOfDaysofCourse * pricePerDayOfCourse;
		double totalPriceOfCourse = 0;
		
		if ((numberOfDaysofCourse > 3) && (knowledgeRequiredForCourse == true)) {
			totalPriceOfCourse = priceOfCourse;
		}
		else {
			totalPriceOfCourse = priceOfCourse + (priceOfCourse / 100 * 21);
		}
		
		if (totalPriceOfCourse < 500){
			
			courseLabel = "Cheap";
		}
		else if (totalPriceOfCourse > 1500) {
			
			courseLabel = "Expensive";
		}
		else {
			courseLabel = "OK";
		}
		
		
		String textIn;
		
		textIn = titleOfCourse + " " + numberOfDaysofCourse + " " + pricePerDayOfCourse + " " + knowledgeRequiredForCourse;
		printInfo(textIn);
		
		textIn = "Number of instructors = " + instructorsOfCourse.size();
		printInfo(textIn);
		
		textIn = "Price of Course = " + totalPriceOfCourse;
		printInfo(textIn);
		
		textIn = "The price appears to be " + courseLabel;
		printInfo(textIn);
		
	}
	
	
	public static void printInfo(String printText) {
		
		System.out.println (printText);
		
		
	}
	
	
	
	
	
	
}