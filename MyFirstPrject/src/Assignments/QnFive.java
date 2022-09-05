package Assignments;

public class QnFive {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before Swapping");
		System.out.println("Enter a number" +a);
		System.out.println("Enter a number" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("Enter a number" +a);
		System.out.println("Enter a number" +b);
	}

}
