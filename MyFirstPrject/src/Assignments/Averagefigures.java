package Assignments;

public class Averagefigures
{
	void  areaOffigure(int a) {
		System.out.println("The area of the Square is: "+a*a+" sq units");
		
		}
	void areaOffigure(int a,int b)
		{
		System.out.println("The area of the Rectangle is: "+a*b +" sq units");
		
			
		}
	void areaOffigure(double c){
			 double z = 3.14 * c * c;
		        System.out.println("The area of the circle is "+z+" sq units");
		       
			}
		
		public static void main(String[] args) {
			Averagefigures a=new Averagefigures();
			a.areaOffigure(2);
			a.areaOffigure(5,2);
			a.areaOffigure(3.14*2);
		}
}
		