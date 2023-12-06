package Recursion;

import java.util.Scanner;

public class VerySimpleRecursion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		callmyself(n);
		s.close();
	}
	static void callmyself(long i) {
		if (i<=0) {
			return;
		}
		System.out.print(i+" ");
		i=i-1;
		callmyself(i);
		
	}

}
