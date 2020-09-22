import java.util.HashMap;
import java.util.Scanner;

public class ExB3 {
	
	
	public static void main(String[] args) {
		
		int[] numberList = {3, 67, 98, 4, 12, 17};
		int myAverage = 0;
		
		for (int i = 0; i < numberList.length; i++) {
			myAverage = myAverage + numberList[i];
		}
		
		myAverage = myAverage / numberList.length;
		
		System.out.println ("Average: " + myAverage);
		
	
	}
	
}