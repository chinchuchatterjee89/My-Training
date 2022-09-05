package Assignments;

public class Average28 
{
	public static void main(String[] args) {
		findAverage(10.5f,20.5f,30.5f);
		findAverage(10,20,30);
		System.out.println("Average of three numbers");
		}
	

	public static void  findAverage(float a,float b,float c)
	{
	float sum=a+b+c;
	float Average= sum/3;
	System.out.println("Average: " +Average);
	}
	public static void findAverage(int a,int b,int c)
	{
		int sum=a+b+c;
		int averageno=sum/3;
		System.out.println("Average: " +averageno);
	}
}
