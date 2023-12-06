package Recursion;

import java.util.Scanner;

public class RecursionsumofAllnumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long sumofallnumbers=sumofallnumbers(n);
		System.out.println(sumofallnumbers);
s.close();
	}
static long sumofallnumbers(long number) {
	if (number!=0) {//9+8+7+6+5+4+3+2+1
		return number+sumofallnumbers(number-1);
		//9+8+sumofallnumber(7)
	}
	else {
		return number;
	}
}
}
