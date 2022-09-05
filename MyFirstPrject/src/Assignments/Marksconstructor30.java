package Assignments;

public class Marksconstructor30{
	int totalmarks;
	int m1,m2,m3;
	String name;
    
public Marksconstructor30( String n,int m1,int m2,int m3){
	name=n;
	totalmarks=m1+m2+m3;}
public static void main(String args[]){
	Marksconstructor30 n= new Marksconstructor30("Chinchu",44,40,45);
	System.out.println("Name:" +n.name);
	System.out.println("Total marks:" +n.totalmarks);
	
	n.grade(n.totalmarks);
	Marksconstructor30 m= new Marksconstructor30("Aaromal",80,90,95);
	System.out.println("Name:" +m.name);
	System.out.println("Total marks:" +m.totalmarks);
	m.grade(m.totalmarks);}
    	
   	public  void grade(int totalmarks2) {
	if(totalmarks2>200)
	{
		System.out.println("Secured Grade: A:" +totalmarks2);
	}
	if(totalmarks2<200)
	{
		System.out.println("Secured Grade: B:" +totalmarks2);
	}
	}
	}
	

