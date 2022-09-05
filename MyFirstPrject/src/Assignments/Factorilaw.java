package Assignments;
//Program to find the factorial of a number
// Two methods, one for find calculate and other for print result.
// Pass the number as argument
// Main method allows to invoke only one method




public class Factorilaw{
	int number;

public void findCalculate(int number) {
this.number=number;
int result=1;
for(int i=1;i<=number;i++)
{
result=result*i;
}
printResult();
	//System.out.println("Factorial of number:"+ number+ " is " +result);
}
	
public void printResult(){

	System.out.println("Factorial of number:"+ number+ " is " +result);
	}
	
	public static void main(String args[]) {
	Factorilaw f=new Factorilaw();
	f.printResult();
	f.findCalculate(5);
}

	
}

