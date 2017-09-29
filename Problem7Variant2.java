package problems;

import java.util.Scanner;

public class Problem7Variant2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ingCount = 0;
			while(ingCount<=20) {
	
			String currentIng = sc.nextLine();
			if(currentIng.equalsIgnoreCase("Bake!")) {
				System.out.println("Preparing cake with "+ingCount+" ingredients.");
				break;
			}
			else System.out.println("Adding ingredient "+currentIng+".");
			ingCount++;
		}
	
	}
// This is the correct solution of the problem (100/100)
}
