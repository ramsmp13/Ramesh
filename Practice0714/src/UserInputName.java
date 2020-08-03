import java.util.*;

public class UserInputName {

	public static void main(String[] args) {
		
		Scanner name = new Scanner (System.in);
		System.out.println("Entert the student name");
		String studname = name.nextLine();
		System.out.println("Student name entered is " +  studname);
		name.close();
				
	}
	}

