package problems;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String profession;
		int quant;
		double waterPr = 0.7;
		double coffeePr = 1;
		double beerPr = 1.7;
		double teaPr = 1.2;
		profession = sc.nextLine();
		quant = sc.nextInt();
		if(profession.equalsIgnoreCase("Athlete"))
			System.out.println("The Athlete has to pay "+String.format("%.2f",quant*waterPr)+ ".");
		else if(profession.equalsIgnoreCase("Businessman") || profession.equalsIgnoreCase("Businesswoman"))
				System.out.println("The "+profession+" has to pay "+String.format("%.2f",quant*coffeePr)+ ".");
		else if(profession.equalsIgnoreCase("SoftUni Student"))
			System.out.println("The SoftUni Student has to pay "+String.format("%.2f",quant*beerPr)+ ".");
		else
			System.out.println("The "+profession+" has to pay "+String.format("%.2f",quant*teaPr)+ ".");
		
	}

}
