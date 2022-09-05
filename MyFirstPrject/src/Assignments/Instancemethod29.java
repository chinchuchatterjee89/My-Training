package Assignments;

public class Instancemethod29 {

	public static void main(String[] args) {
		Instancemethod29 i=new Instancemethod29();
		i.findAverage(10.5f,20.5f,30.5f);
		i.findAverage(10, 20, 30);
	}
	

public void findAverage(float a,float b,float c)
{
float sum=a+b+c;
float Average= sum/3;
System.out.println("Average: " +Average);
}
public void findAverage(int a,int b,int c)
{
	int sum=a+b+c;
	int averageno=sum/3;
	System.out.println("Average: " +averageno);
}
}