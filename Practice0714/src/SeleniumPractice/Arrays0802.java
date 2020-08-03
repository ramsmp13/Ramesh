package SeleniumPractice;

import java.util.Scanner;

public final class Arrays0802 {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the number of elements of array");
		int n1=sc2.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter the elements into array");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc2.nextInt();
		}
		System.out.println("Elelments entered by user is:");
		for (int i=0;i<n1;i++)
		{
			System.out.println(arr1[i]);
		}
		sc2.close();
	}

}
