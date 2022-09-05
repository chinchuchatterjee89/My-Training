package Assignments;

public class Eligiblevoting25 {
 static int age;
 public static void getDetails(int g)
 {
	 age=g;
 }
 public static void printDetails()
 {
	 System.out.println(""+age);
 }
 
	public static void main(String[] args) {
		getDetails(15);
		 printDetails();
		if(age>=18)
		{
			System.out.println("Eligible for voting" );
		}
		else
		{
			System.out.println("Not Eligible for voting");	
	}

}}
