package problems;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int magical = sc.nextInt();
		int counter = 0;
		for (int i = firstNum; i<=secondNum; i++) {
			for(int p = firstNum; p<=secondNum; p++) {
				//System.out.print(i+" "+p+"; ");
				counter++;
				if((i+p)==magical) {
					System.out.println("Number found! "+p+" + "+i+" = "+magical);
					return;
				}
			}	
		}
		System.out.println(counter +" combinations - neither equals "+magical);
	}

}
