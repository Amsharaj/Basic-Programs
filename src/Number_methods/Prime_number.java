package Number_methods;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		int count = 0;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			System.out.print(n+" is Not a prime");
			count++;
			break;
		}
	}
	if(count==0&&n!=1)
		System.out.print(n+" is a prime");
	s.close();
	}

}
