package Looping;

import java.util.Scanner;

public class Prg2 {

	public static void main(String[] args) {
		int n;
	Scanner s=new Scanner(System.in);
	System.out.print("enter the number:");
		n=s.nextInt();
		if(n>0)
			System.out.print("Positive number");
		else if(n==0)
			System.out.print("Zero");
		else
			System.out.print("Negative number");
		s.close();
	}

}
