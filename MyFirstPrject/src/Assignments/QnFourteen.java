package Assignments;

public class QnFourteen {

	public static void main(String[] args) {
		int num = 4884;
		int r,sum=0,temp;
		 temp = num;
		
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
		{
			System.out.println(temp+" is not a palindrome number" );


	}

	}}
