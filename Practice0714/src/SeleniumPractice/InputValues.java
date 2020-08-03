package SeleniumPractice;

import java.util.Scanner;

public class InputValues {

	public static void main(String[] args) {
						
				Scanner RamObj = new Scanner(System.in);
				System.out.println("Please enter Name, EmpNum, Salary");
				
				String Name = RamObj.nextLine();
				int EmpNum = RamObj.nextInt();
				float Salary = RamObj.nextFloat();
				
				System.out.println("Employee name entered is " + Name);
				System.out.println("Employee name entered is " + EmpNum);
				System.out.println("Employee name entered is " + Salary);
				RamObj.close();
						}

		
	}

