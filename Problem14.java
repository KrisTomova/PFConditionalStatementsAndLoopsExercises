package problems;

import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		String exseption = sc.nextLine();
		char firstLetter = first.charAt(0);
		char secondLetter = second.charAt(0);
		char exseptionLetter = exseption.charAt(0);
		String withoutEx="";

		for (char i = firstLetter;i<=secondLetter; i++) {
			for (char j = firstLetter;j<=secondLetter; j++) {
				for (char k = firstLetter;k<=secondLetter; k++) {
					String result = String.format("%s%s%s",i,j,k);
					if((i!=exseptionLetter && j!=exseptionLetter) && k!=exseptionLetter) {
						withoutEx=withoutEx+result+" ";
					}
				}
			}
		}
		System.out.println(withoutEx);
		
		
	}

}
