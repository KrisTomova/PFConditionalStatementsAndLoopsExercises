package problems;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int damagePesho = sc.nextInt();
		int damageGosho = sc.nextInt();
		int healthPesho = 100;
		int healthGosho = 100;
		int counter =0;
		while(healthPesho>0 && healthGosho>0) {
			counter++;
			if(counter%2!=0) {
				healthGosho-=damagePesho;
				if(healthGosho<1) {
					System.out.println("Pesho won in "+counter+"th round.");
					break;
				}
				System.out.println("Pesho used Roundhouse kick and reduced Gosho to "+healthGosho+" health.");
				
			}
			else {
				healthPesho-=damageGosho;
				if(healthPesho<1) {
					System.out.println("Gosho won in "+counter+"th round.");
					break;
				}
				System.out.println("Gosho used Thunderous fist and reduced Pesho to "+healthPesho+" health.");
				
			}
			if(counter%3==0) {
				healthGosho+=10;
				healthPesho+=10;
			}
		}

	}
}
