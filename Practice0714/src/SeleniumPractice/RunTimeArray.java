package SeleniumPractice;

import java.util.*;

public abstract class RunTimeArray {

	public static void main(String[] args) {
		
		Scanner RamObj = new Scanner(System.in);
		System.out.println("Enter the number of values u want to enter");
		int length = RamObj.nextInt();
		int intarray[] = new int[length];
		
		System.out.println("Please nter the values");
		
		for(int i=0;i<length;i++)
		{
			intarray[i] = RamObj.nextInt();
				}
		RamObj.close();
	}

}
