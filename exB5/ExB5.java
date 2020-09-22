import java.util.ArrayList;
import java.util.Scanner;

public class ExB5 {
	
	
	public static void main(String[] args) {
		
		String doAgainString = "Y";
		
		while (doAgainString.equals("Y")){
			
			System.out.println ("Welcome!");
		
			Scanner doAgain = new Scanner(System.in);
			System.out.println ("Greet Again? Y/N");
		
			doAgainString = doAgain.nextLine();
			System.out.println (doAgainString);
			
		
		}
		
		
		
	}
	
}