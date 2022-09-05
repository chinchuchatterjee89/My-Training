package Assignments;

public class Qn21 {
	static void bubbleSorts(int a[]) {
		int n=a.length;
		int temp=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1;j++);{
		int j=0;
			if(a[j-1]>a[j])
				temp=a[j-1];
			a[j-1]=a[j];
			
			a[j]=temp;
			}}
	public static void main(String[] args) {
		int a[]= {50,30,40,20,70,15,10};
		System.out.println("Before Bubble sorting");
	
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+ " ");
		}
	
		System.out.println();
		bubbleSorts(a);
		
		System.out.println("After Bubble sorting");{
		for(int j=0;j<a.length-1;j++)			
			System.out.print(a[j]+ " ");}
		
		System.out.println();
		
	}

}
