package SeleniumPractice;

import java.util.Scanner;

public class IpValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter student name and number ");
		String name = sc.next();
			int num = sc.nextInt();
		System.out.println("student name and number entered is" + name +num);
		sc.close();
		
	}

}
