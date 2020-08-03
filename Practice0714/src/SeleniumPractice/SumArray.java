package SeleniumPractice;

import java.util.Scanner;

public class SumArray {
	
		public static void main(String[] args) {
		int sum=0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number of elemented req");
		int n = s1.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = s1.nextInt();
		}
		System.out.println("The values entered by you are");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Sum of array of elements is");
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			
		}
		
		System.out.println(sum);
		for(int i=0;i<n;i++)
		{
			if(arr[i]>arr[i+1])
			{
				System.out.println(arr[i]);
			}
			
		}
	}
}
