package Looping;

import java.util.Scanner;

public class Prg3 {

	public static void main(String[] args) {
		int n;
		Scanner s =new Scanner(System.in);
		System.out.print("enter the number:");
		n=s.nextInt();
		if(n%2==1)
			System.out.print("even number");
		else
			System.out.print("odd number");
		s.close();
			

	}

}
