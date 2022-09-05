package Assignments;


	import java.util.Scanner;
	public class Qn32a {
	public static void main(String[] args) {
	System.out.println("enter an input");
	Scanner sc=new Scanner(System.in);
	String original= sc.nextLine();

	String reverse="";
	for(int i=original.length()-1;i>=0;i--){
	reverse+=original.charAt(i);
	System.out.println(reverse);}
	boolean palindrome=true;
	for(int i=0;i<original.length();i++){
	if(original.charAt(i)!=reverse.charAt(i)){
	palindrome=false;}}
	if(palindrome){
	System.out.println("Is a Palindrome");}
	else{
	System.out.println("Not a Palindrome");
	}}}
