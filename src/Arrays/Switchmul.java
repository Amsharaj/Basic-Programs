package Arrays;

import java.util.Scanner;

public class Switchmul {

	public static void main(String[] args) {
		
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first number:");
		x=s.nextInt();
		System.out.print("Enter the second number:");
		y=s.nextInt();
		System.out.println("choose the operation you want to perform");
		System.out.println("choose 1 to add");
		System.out.println("choose 2 to sub");
		System.out.println("choose 3 to mul");
		System.out.println("choose 4 to div");
		System.out.println("choose 5 to mod");
		System.out.println("choose 6 to exit");
		int n=s.nextInt();
		switch(n) {
		case 1:
		int add;
		add=x+y;
		System.out.print("result="+add);
		break;
		case 2:
		int sub;
		sub=x-y;
		System.out.print("result="+sub);
		break;
		case 3:
			int mul;
			mul=x*y;
			System.out.print("result="+mul);
			break;
		case 4:
			int div;
			div=x/y;
			System.out.print("result="+div);
			break;
		case 5:
			int mod;
			mod=x%y;
			System.out.print("result="+mod);
			break;
		case 6:
			
			System.out.print("exit");
			s.close();
			
		}
		
		

	}

}
