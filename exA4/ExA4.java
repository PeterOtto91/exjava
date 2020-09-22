import java.util.ArrayList;

public class ExA4 {
	
	
	public static void main(String[] args) {
		
		
		String titleOfCourse = args[0];
		int numberOfDaysofCourse = Integer.parseInt(args[1]);
		double pricePerDayOfCourse = Double.parseDouble(args[2]);
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