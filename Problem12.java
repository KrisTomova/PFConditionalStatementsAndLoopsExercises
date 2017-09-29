package problems;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int maxSum = sc.nextInt();
		int sum = 0;
		int counter = 0;
		for (int i = firstNum; i >= 1; i--) {
			for (int p = 1; p <= secondNum; p++) {
				// System.out.print(i + " "+ p + "; ");
				counter++;
				int multiplication = 3 * i * p;
				sum = sum + multiplication;
				if (sum >= maxSum) {
					System.out.println(counter + " combinations");
					System.out.println("Sum: " + sum + " >= " + maxSum);
					return;
				}

			}
			// System.out.println(sum);

		}
		if (maxSum > sum) {
			System.out.println(counter + " combinations");
			System.out.println("Sum: " + sum);
		}
	}

}
