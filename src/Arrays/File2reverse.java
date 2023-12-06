package Arrays;

import java.util.Scanner;

public class File2reverse {

	public static void main(String[] args) {
		int n,r,reverse =0;
		Scanner s =new Scanner(System.in);
		//System.out.print("Enter the number:");
		n=s.nextInt();
		
		while(n>0) {
			r=(n+1)%10;
			n=n/10;
			reverse=reverse*10+r;
			
			
	}
		//System.out.println(reverse);
		while(reverse>0) {
			r=reverse%10;
			System.out.print(r);
			reverse=reverse/10;
		}s.close();
	}
}
