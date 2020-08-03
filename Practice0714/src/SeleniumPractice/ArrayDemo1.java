package SeleniumPractice;

import java.util.Scanner;

public class ArrayDemo1 {
	
		public static void main(String[] args) {
		
			System.out.println("Enter the number of values u want to enter");
			Scanner sc1 = new Scanner(System.in);
			int n = sc1.nextInt();
			int arr[] = new int[n];
			for (int i=0;i<n;i++)
			{
				arr[i] = sc1.nextInt();
			}
			
			for(int i=0; i<n;i++)
			{
				System.out.println("Values entered by you are:" +arr[i]);
			
			
						}

	}

}
