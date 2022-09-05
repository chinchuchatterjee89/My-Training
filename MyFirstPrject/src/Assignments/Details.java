//Get basic pay, deduction and bonus from console.

package Assignments;

import java.util.Scanner;

public class Details {

 int bp,dd,bonus;
public void getDetails(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Basic pay :" );
	bp=sc.nextInt();
	System.out.println("Enter Deduction :" );
	dd=sc.nextInt();
	System.out.println("Enter Bonus:" );
	bonus=sc.nextInt();
}
}
