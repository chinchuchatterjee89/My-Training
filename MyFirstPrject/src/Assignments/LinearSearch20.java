package Assignments;



public class LinearSearch20 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int size=a.length;
		int value=30;
		for(int i=0;i<size-1;i++)
		{
			if(a[i]==value) {
				System.out.println("Element found in index:" +i);
			}
		}
}
}