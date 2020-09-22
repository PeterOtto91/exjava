import java.util.ArrayList;
import java.util.Scanner;

public class ExB4 {
	
	
	public static void main(String[] args) {
		String welkomString = " ";
		
		Scanner userLanguage = new Scanner(System.in);
		System.out.println ("Your Language?");
		
		String inUserLanguage = userLanguage.nextLine();
		
		switch (inUserLanguage) {
			case "NL": 
				welkomString = "Goeiedag!";
				break;
			case "IT": 
				welkomString = "Buon Giorno!";
				break;
			case "EN": 
				welkomString = "Good Day!";
				break;
			default:
				welkomString = "Goeiedag, Buon Giorno and Good Day";
		}
		
		
		System.out.println (welkomString);
		
	}
	
}