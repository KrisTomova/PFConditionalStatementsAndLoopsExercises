package problems;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ing;
		int n;
		n = sc.nextInt();
		int i = 0;
		int totalCalories = 0;
		if(n<=20) {
		while(i<=n) {
		ing = sc.nextLine();
		i++;
		if(ing.equalsIgnoreCase("Cheese"))
			totalCalories+=500;
		else if(ing.equalsIgnoreCase("Tomato sauce"))
			totalCalories+=150;
		else if(ing.equalsIgnoreCase("Salami"))
			totalCalories+=600;
		else if(ing.equalsIgnoreCase("Pepper"))
			totalCalories+=50;
	} 
		System.out.println("Total calories: "+totalCalories);
}
}
}
