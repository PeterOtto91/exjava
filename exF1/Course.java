
import java.util.ArrayList;

public class Course {

	private String courseTitle;
	private int courseNumberDays;
	private double coursePriceDay;
	private boolean courseKnowledge;
	private ArrayList<String> courseInstructors = new ArrayList<String>();


	public Static void Course (String courseTitle, int courseNumberDays, double coursePriceDay, boolean courseKnowledge, Arraylist courseInstructors){
		this.courseTitle = courseTitle;
		this.courseNumberDays = courseNumberDays;
		this.coursePriceDay = coursePriceDay;
		this.courseKnowledge = courseKnowledge;
		this.courseInstructors = courseInstructors;
	}
	
	public String getCourseTitle(){
		return this.courseTitle;
	}
	
	public void setCourseTitle(String title){
		this.courseTitle = title;
	}

	public int getCourseNumberDays(){
		return this.courseNumberDays;
	}
	
	public void setCourseTitle(int days){
		this.courseNumberDays = days;
	}
	
	public double getCoursePriceDay(){
		return this.coursePriceDay;
	}
	
	public void setCoursePriceDay(double price){
		this.coursePriceDay = price;
	}
	
	public boolean getCourseKnowledge(){
		return this.courseKnowledge;
	}
	
	public void setCourseKnowledge(boolean knowledge){
		this.courseKnowledge = knowledge;
	}
	
	public ArrayList getCourseInstructors(){
		return this.courseInstructors;
	}
	
	public void setCourseInstructors(Arraylist instructors){
		this.courseInstructors = instructors;
	}
	
	
	
	
	public static void addInstructor(String newInstructor){
		courseInstructors.add(newInstructor);
		
	}
	
	public static void removeInstructor(String rInstructor){
		courseInstructors.remove(rInstructor);
	}
	
	
	
	
}







