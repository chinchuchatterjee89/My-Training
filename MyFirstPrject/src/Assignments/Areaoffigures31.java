package Assignments;
import java.util.Scanner;
public class Areaoffigures31 {

	public static void main(String[] args) {
		 Scanner sc  = new Scanner(System.in);
	        
	        System.out.println("Enter a to calculate area of circle");
	        System.out.println("Enter b to calculate area of square");
	        System.out.println("Enter c to calculate area of rectangle");
	        System.out.print("Enter your choice: ");
	        char choice = sc.next().charAt(0);
	        
	     switch(choice) {
	     case'a':
	         System.out.print("Area of circle ");
             double r = sc.nextDouble();
             double area = 3.14 * r * r;
             System.out.println("Area of circle = " + area);
             break;
             
         case 'b':
             System.out.print("Enter side of square: ");
             double side = sc.nextDouble();
             double areasquare = side * side;
             System.out.println("Area of square = " + areasquare);
             break;
             
         case 'c':
             System.out.print("Enter length of rectangle: ");
             double l = sc.nextDouble();
             System.out.print("Enter breadth of rectangle: ");
             double b = sc.nextDouble();
             double arearect = l * b;
             System.out.println("Area of rectangle = " + arearect);
             break;
             
			 default:
	                System.out.println("Wrong choice!");
	        }}}
