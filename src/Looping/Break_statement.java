package Looping;

import java.util.Scanner;

public class Break_statement {



	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of element:");
		n=s.nextInt();
		
		String array1[]=new String[n];
		System.out.print("Enter the array element one by one:");
		for(int i=0;i<n;i++) {
			array1[i]=s.next();
		}
		System.out.println("Output:");
		for(int i=0;i<n;i++) {
			System.out.println(array1[i]);
		}s.close();
	}

}
