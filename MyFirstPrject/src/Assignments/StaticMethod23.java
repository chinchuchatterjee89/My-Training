package Assignments;

public class StaticMethod23 {

static int age;
static String name;
public StaticMethod23()
{
System.out.println("Constructor calling");
}


public static void getDetails(int g,String n)
{
	age=g;
	name=n;
	
}
	public static void printDetails()
	{
		System.out.println("Age:"+age);
		System.out.println("Name:"+name);
	}
	public static void main(String[] args) {
		
		getDetails(20,"chinchu");
		printDetails();
	}

	

}
