package problems;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int times=0;
		while(times<100) {
		try {
			int number = sc.nextInt();
			i++;
		}
		catch(Exception e) {
			System.out.println(i);
			return;
		}
	}
	}
}
