import java.util.ArrayList;

public class ExA2 {
	
	
	public static void main(String[] args) {
		
		String titleOfCourse = "Java Programming";
		int numberOfDaysofCourse = 5;
		double pricePerDayOfCourse = 100.5;
		boolean knowledgeRequiredForCourse = false;
		ArrayList<String> instructorsOfCourse = new ArrayList<String>();
		instructorsOfCourse.add ("Jan");
		instructorsOfCourse.add ("Wim");
		instructorsOfCourse.add ("Dirk");
		
		
		System.out.println (titleOfCourse + " " + numberOfDaysofCourse + " " + pricePerDayOfCourse + " " + knowledgeRequiredForCourse);
		System.out.println ("Number of instructors = " + instructorsOfCourse.size());
	}
	
}