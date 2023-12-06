package Arrays;

import java.util.Scanner;

public class Technum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,result;
		System.out.print("Enter the number:");
		n=s.nextInt();
		String str1=String.valueOf(n);
		if(str1.length()==4) {
			result=(int)Math.pow((n/100)+(n%100), 2);
			System.out.println("n="+n);
			System.out.println("result="+result);
			if(n==result)
				System.out.println("tech number");
			else
				System.out.println("not tech number");
		}
		else
			System.out.println("not a valid number");
		s.close();
		
	}

}
