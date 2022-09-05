package Assignments;

public class Factorial23 {
	
public static void factMethod() {
int n=5;
int result=1;
for(int i=1;i<=n;i++)
{

result=result*i;
}
	System.out.println("Factorial of number:"+ n+ " is " +result);

	}
public static void main(String args[]) {
Factorial23.factMethod();
}
}