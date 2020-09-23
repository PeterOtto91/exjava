import java.util.ArrayList;
import java.util.Scanner;

public class ExC2 {
	
	
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
	
	
	public static void printInfo(String titleIn, int daysIn, double priceIn, boolean knowledgeIn, int instructorsIn, double totalIn, String labelIn) {
		
		System.out.println (titleIn + " " + daysIn + " " + priceIn + " " + knowledgeIn);
		System.out.println ("Number of instructors = " + instructorsIn);
		System.out.println ("Price of Course = " + totalIn);
		System.out.println ("The price appears to be " + labelIn);
		
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