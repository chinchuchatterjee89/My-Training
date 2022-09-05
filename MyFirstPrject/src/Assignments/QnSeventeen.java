package Assignments;

public class QnSeventeen {

	public static void main(String[] args) {
		int a[] = {10,11,12,13,14,15,16,17,18,19,20};
		int even=0, odd=0;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				even++;
			}
			else
				odd++;
		}
		System.out.println("Number of even numbers in the array:" +even);
		System.out.println("Number of even numbers in the array:" +odd);


	}

}
