package Assignments;

import java.util.Scanner;

//	Program to find the reverse of a number
	//  Two constructors, one for calculation reverse and other for display “Finding reverse…”
	//  Argument variable and instance variable should be same
	//  Main method allows to invoke only one constructor
	public class Reversenum {
		 int num;
		
	Reversenum()
	{
		System.out.println("Finding reverse");
	}
	Reversenum(int num) {
	this();
	this.num=num;
	int temp=num,reverseNum=0,remainder=0;
		while(temp!=0){
			remainder=temp%10;
			reverseNum=reverseNum*10+remainder;
			temp=temp/10;
	}
		System.out.println("The reverse of "+num+" is "+reverseNum);
		}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int num=sc.nextInt(); 
		Reversenum r=new Reversenum(num);
		}}
		
		
		
		
