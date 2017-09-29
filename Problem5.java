package problems;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String noun;
		String temp;
		noun = sc.next();
		if(noun.endsWith("y")) {
			//temp=temp.concat(noun.charAt(noun.length()-2));
			//temp[1]=(char)noun.charAt(noun.length()-1);
			//System.out.println(Character.toString(noun.charAt(noun.length()-2)));
			//System.out.println(Character.toString(noun.charAt(noun.length()-1)));
			noun = noun.replaceAll(Character.toString(noun.charAt(noun.length()-2))+Character.toString(noun.charAt(noun.length()-1)),Character.toString(noun.charAt(noun.length()-2))+"ies");
			//noun = noun.replaceFirst( temp.toString(), noun.charAt(noun.length()-2)+"ies");
			System.out.println(noun);
		} else if(noun.endsWith("o") || noun.endsWith("ch") || noun.endsWith("s") || noun.endsWith("sh") || noun.endsWith("x") || noun.endsWith("z")) 
			System.out.println(noun.concat("es"));
	
		else System.out.println(noun.concat("s"));
		
	}

}
