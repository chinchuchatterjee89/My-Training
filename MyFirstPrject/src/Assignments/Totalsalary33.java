package Assignments;
import Assignments.Details;
import Assignments.Calculate;
public class Totalsalary33 {

	public static void main(String[] args) {
		Details d=new Details();
		d.getDetails();
		Calculate c=new Calculate();
		c.calculateDetails(d.bp);
		float ts= d.bp+d.dd+d.bonus;
		System.out.println("Salary Slip");
		System.out.println("Basic Pay:" +d.bp);
		System.out.println("Deduction:" +d.dd);
		System.out.println("Bonus:" +d.bonus);
		System.out.println("Total salary ="+ts);
	
	}

}
