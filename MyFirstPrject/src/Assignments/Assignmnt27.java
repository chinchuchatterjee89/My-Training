package Assignments;

import java.util.*;

public class Assignmnt27 {
 static int amount =0;
 static int checkprice(String item){
	 if(item.equals("rice"))
	 {
		 System.out.println("hello u bought rice");
		 return 120;
		  }
	 if(item.equals("milk"))
	 {
		 System.out.println("hello u bought milk");
		 return 40;
		  } 
	 if(item.equals("dal"))
	 {
		 System.out.println("hello u bought milk");
		 return 50;
	 }
	 else
	 {
		 return 0;}}
 public  void totalamount(int amount) {
		if(amount>5000)
		{
			System.out.println("Get 20% discount:" +amount);
		}
		if(amount<5000)
		{
			System.out.println("No discount:" +amount);
		}
		}
		
	

public static void main(String args[]) {
	int noofitems;
	System.out.println("Enter no. of items to purchase");
	Scanner sc= new Scanner(System.in);
	noofitems= sc.nextInt();
	for(int i=1;i<=noofitems;i++)
	{
		System.out.println("Do you want to buy rice or dal or milk");
	}
	String options=sc.next();
	if(options.equals("rice"));{
		amount=amount+checkprice("rice");
	}
	if(options.equals("dal"));{
		amount=amount+checkprice("dal");}
	if(options.equals("milk"));{
		amount=amount+checkprice("milk");}}{
System.out.println("Total amount :" +amount);
}}   