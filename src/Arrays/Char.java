package Arrays;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter the character:");
		char ch=s.next().charAt(0);
		switch(ch)
		{case 'a'|'A':
		case'e'|'E':
		case'i'|'I':
		case'o'|'O':
		case'u'|'U':
			System.out.println("vowel");
			default:
			System.out.println("consonant");
			s.close();
			
		}

	}

}



		
	
