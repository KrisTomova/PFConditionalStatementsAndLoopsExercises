package problems;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		do {
		a=sc.nextInt();
		b=sc.nextInt();
		}while(a==b||a<0||b<0||a>100||b>100);
		if(a>b) {
			int temp=b;
			b=a;
			a=temp;
		}
		for(int i=a;i<=b;i++) {
			System.out.println(i);
		}
	}

}
