package Pattern_program;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n,ascii;
		int n;
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			//ascii=65;
			ch='a';
			for(int j=1;j<=i;j++) {
				//System.out.printf("%c",ascii);
				//ascii++;
				System.out.print(ch);
				ch++;
			}
			System.out.println();	

		}
s.close();
	}

}
