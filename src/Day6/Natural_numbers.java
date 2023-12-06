package Day6;

import java.util.Scanner;

public class Natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0; 
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		n=s.nextInt();
		for (int i=1;i<=n;i++) {
			sum=sum+i;
			s.close();
		}
			System.out.print(sum);
		}
		

	

}
