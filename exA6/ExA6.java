import java.util.HashMap;
import java.util.Scanner;

public class ExA6 {
	
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> daysOfTheMonth = new HashMap<String, Integer>();
		
		daysOfTheMonth.put("January", 31);
		daysOfTheMonth.put("February", 28);
		daysOfTheMonth.put("March", 31);
		daysOfTheMonth.put("April", 30);
		daysOfTheMonth.put("May", 31);
		daysOfTheMonth.put("June", 30);
		daysOfTheMonth.put("July", 31);
		daysOfTheMonth.put("August", 31);
		daysOfTheMonth.put("September", 30);
		daysOfTheMonth.put("Oktober", 31);
		daysOfTheMonth.put("November", 30);
		daysOfTheMonth.put("December", 31);
		
				
		Scanner dayOfMonth = new Scanner(System.in);
		System.out.println ("Day of the Month?");
		
		int dayOfTheMonth = Integer.parseInt(dayOfMonth.nextLine());
		
		
		Scanner month= new Scanner(System.in);
		System.out.println ("Month?");
		
		String monthName = month.nextLine();
		
		
		int monthLength = daysOfTheMonth.get(monthName);
		
		int daysToGo = monthLength - dayOfTheMonth;
		
		System.out.println ("Days to go: " + daysToGo);
		
	
	}
	
}