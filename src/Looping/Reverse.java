package Looping;

import java.util.Scanner;

//reverse the number
public class Reverse {

	public static void main(String[] args) {
		int n,r,reverse = 0,temp;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the number:");
		n=s.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			//System.out.println(r);
			n=n/10;
			//Sum=Sum+r;
			reverse=reverse*10+r;
			s.close();
			
		}
		System.out.println("Reverse="+reverse);
		if(temp==reverse)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
