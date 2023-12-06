package Day6;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the grade:");
		char ch=scan.next().charAt(0);
		switch(ch)
		{
		case'A':System.out.println("Excellent");
		break;
		case'B':
		case'C':	System.out.println("Well done");
		break;
		case'D':System.out.println("You passed");
		case'F':System.out.println("better try again");
		break;
		default:System.out.println("Invalid input");
		}
		System.out.println("Your grade is:"+ch);
	scan.close();
         
	}

}
