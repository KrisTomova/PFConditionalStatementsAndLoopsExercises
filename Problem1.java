package problems;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String profession;
		//System.out.println("Enter profession: ");
		profession = sc.nextLine();
		if(profession.equalsIgnoreCase("Athlete"))
			System.out.println("Water");
		else if(profession.equalsIgnoreCase("Businessman") || profession.equalsIgnoreCase("Businesswoman"))
				System.out.println("Coffee");
		else if(profession.equalsIgnoreCase("SoftUni Student"))
			System.out.println("Beer");
		else
			System.out.println("Tea");
	}
	// TODO Auto-generated method stub

}
