import java.util.ArrayList;
import java.util.Scanner;

public class ExA5 {
	
	
	public static void main(String[] args) {
		
		Scanner title = new Scanner(System.in);
		System.out.println ("Title?");
		
		String titleOfCourse = title.nextLine();
		
		
		Scanner numberOfDays = new Scanner(System.in);
		System.out.println ("Number of days?");
		
		int numberOfDaysofCourse = Integer.parseInt(numberOfDays.nextLine());
		
		
		Scanner pricePerDay = new Scanner(System.in);
		System.out.println ("Price per Day?");
		
		double pricePerDayOfCourse = Double.parseDouble(pricePerDay.nextLine());
		
		
		boolean knowledgeRequiredForCourse = false;
		ArrayList<String> instructorsOfCourse = new ArrayList<String>();
		
		instructorsOfCourse.add ("Jan");
		instructorsOfCourse.add ("Wim");
		instructorsOfCourse.add ("Dirk");
		
		double priceOfCourse = numberOfDaysofCourse * pricePerDayOfCourse;
		double totalPriceOfCourse = priceOfCourse + (priceOfCourse / 100 * 21);
		
		System.out.println (titleOfCourse + " " + numberOfDaysofCourse + " " + pricePerDayOfCourse + " " + knowledgeRequiredForCourse);
		System.out.println ("Number of instructors = " + instructorsOfCourse.size());
		System.out.println ("Price of Course = " + totalPriceOfCourse);
		
	}
	
}