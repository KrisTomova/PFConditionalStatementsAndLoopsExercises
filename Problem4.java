package problems;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String month;
		double nights;
		month = sc.nextLine();
		nights = sc.nextDouble();
		if(nights>=0 && nights<=200) {
		if(month.equalsIgnoreCase("May")) {
			if(nights>7)
			{
				System.out.println("Studio: "+String.format("%.2f",(50*nights*0.95))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(65*nights))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(75*nights))+" lv.");
			}
			else {
				System.out.println("Studio: "+String.format("%.2f",(50*nights))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(65*nights))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(75*nights))+" lv.");
			}
		}
		else if(month.equalsIgnoreCase("October")) {
			if(nights>7)
			{
				System.out.println("Studio: "+String.format("%.2f",(50*(nights-1)*0.95))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(65*nights))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(75*nights))+" lv.");
			}
			else {
				System.out.println("Studio: "+String.format("%.2f",(50*nights))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(65*nights))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(75*nights))+" lv.");
			}
		}
		else if(month.equalsIgnoreCase("June")) {
			if(nights>14)
			{
				System.out.println("Studio: "+String.format("%.2f",(60*nights))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(72*nights*0.90))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(82*nights))+" lv.");
			}
			else {
				System.out.println("Studio: "+String.format("%.2f",(60*nights))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(72*nights))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(82*nights))+" lv.");
			}
		}
		else if(month.equalsIgnoreCase("September")) {
			if(nights>7 && nights<=14)
			{
				System.out.println("Studio: "+String.format("%.2f",(60*(nights-1)))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(72*nights))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(82*nights))+" lv.");
			}
			else if(nights>14)
			{
				System.out.println("Studio: "+String.format("%.2f",(60*(nights-1)))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(72*nights*0.90))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(82*nights))+" lv.");
			}
			else {
				System.out.println("Studio: "+String.format("%.2f",(60*nights))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(72*nights))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(82*nights))+" lv.");
			}
		}
		else if(month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("December")) {
			if(nights>14)
			{
				System.out.println("Studio: "+String.format("%.2f",(68*nights))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(77*nights))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(89*nights*0.85))+" lv.");
			}
			else {
				System.out.println("Studio: "+String.format("%.2f",(68*nights))+" lv.");
				System.out.println("Double: "+String.format("%.2f",(77*nights))+" lv.");
				System.out.println("Suite: "+String.format("%.2f",(89*nights))+" lv.");
			}
		}
		}
		else System.out.println("Index out of bounds!");
	}

}
