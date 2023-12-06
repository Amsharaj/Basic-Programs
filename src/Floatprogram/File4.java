
package Floatprogram;

import java.util.Scanner;

public class File4 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner s = new Scanner(System.in);
		System.out.print("enter thr num1: ");
		num1 = s.nextInt();
		System.out.print("enter thr num2: ");
		num2 = s.nextInt();
		System.out.println(num1+num2);
		s.close();
	}

}
