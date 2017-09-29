package problems;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int people;
		String service;
		people = sc.nextInt();
		service = sc.next();
		if(people<=50)
		{
			if(service.equalsIgnoreCase("Normal"))
			{
				System.out.println("We can offer you the Small Hall");
				System.out.println("The price per person is "+String.format("%.2f", (3000*0.95)/people)+"$");
			}
			else if(service.equalsIgnoreCase("Gold"))
			{
				System.out.println("We can offer you the Small Hall");
				System.out.println("The price per person is "+String.format("%.2f", (3250*0.9)/people)+"$");
			}
			else if(service.equalsIgnoreCase("Platinum"))
			{
				System.out.println("We can offer you the Small Hall");
				System.out.println("The price per person is "+String.format("%.2f", (3500*0.85)/people)+"$");
			}
		}
		else if(people>50 && people<=100)
		{
			if(service.equalsIgnoreCase("Normal"))
			{
				System.out.println("We can offer you the Terrace");
				System.out.println("The price per person is "+String.format("%.2f", (5500*0.95)/people)+"$");
			}
			else if(service.equalsIgnoreCase("Gold"))
			{
				System.out.println("We can offer you the Terrace");
				System.out.println("The price per person is "+String.format("%.2f", (5750*0.9)/people)+"$");
			}
			else if(service.equalsIgnoreCase("Platinum"))
			{
				System.out.println("We can offer you the Terrace");
				System.out.println("The price per person is "+String.format("%.2f", (6000*0.85)/people)+"$");
			}
		}
		else if(people>100 && people<=120)
		{
			if(service.equalsIgnoreCase("Normal"))
			{
				System.out.println("We can offer you the Great Hall");
				System.out.println("The price per person is "+String.format("%.2f", (8000*0.95)/people)+"$");
			}
			else if(service.equalsIgnoreCase("Gold"))
			{
				System.out.println("We can offer you the Great Hall");
				System.out.println("The price per person is "+String.format("%.2f", (8250*0.9)/people)+"$");
			}
			else if(service.equalsIgnoreCase("Platinum"))
			{
				System.out.println("We can offer you the Great Hall");
				System.out.println("The price per person is "+String.format("%.2f", (8500*0.85)/people)+"$");
			}
		}
		else if(people>120)
			System.out.println("We do not have an appropriate hall.");
		
	}

}
