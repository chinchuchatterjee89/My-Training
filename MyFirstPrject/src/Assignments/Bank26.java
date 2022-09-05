package Assignments;

public class Bank26 {
 static int accountAmount;
 public static int balanceAmount(int amount) {
 int balance=0;
 if(accountAmount>amount) {
	 balance=1;
	 System.out.println("can withdraw the amount");}
	 else
	 {
		 balance=-1;
		 System.out.println("cannot withdraw the amount");}
 			return balance;
 }
 public static void deposit(int amount)
 {
	accountAmount=accountAmount+amount; 
	System.out.println("Rupees"+amount+ " is deposited to your account");
 }
 public static void withdraw(int amount)
 {
	 int balance=balanceAmount(amount);

	 {
		 if(balance>0) {
			 accountAmount=accountAmount-amount;
		 }
	 }
	 System.out.println("Rupees" +amount+ " is withdrawn from your account");
 }
public static void main(String args[]) {
	deposit(1000);
	withdraw(500);
	balanceAmount(1500);
}
 }
 