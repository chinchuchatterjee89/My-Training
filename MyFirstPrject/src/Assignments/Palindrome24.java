package Assignments;

public class Palindrome24 {

    static int rem,a,rev=0;

	public static void getReverse(int n)
	{
		a=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
	}
	}
	public static void printDetails()
	{

		if(a==rev)
		{
			System.out.println(rev+" is a palindrome number");
		}
		else
		{
			System.out.println(rev+" is not a palindrome number" );
	}}
	public static void main(String[] args) {
		
		Palindrome24.getReverse(4884);
		Palindrome24.printDetails(); 
	}

}