package problems;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		if (firstNum < secondNum && secondNum - firstNum >= 5) {
			for (int i = firstNum; i <= secondNum; i++) {
				for (int j = firstNum; j <= secondNum; j++) {
					for (int k = firstNum; k <= secondNum; k++) {
						for (int l = firstNum; l <= secondNum; l++) {
							for (int m = firstNum; m <= secondNum; m++) {
								if (i < j && j < k && k < l && l < m)
									System.out.println(i + " " + j + " " + k + " " + l + " " + m);
							}

						}

					}

				}

			}
		} else
			System.out.println("No");
	}
}
