package Number_methods;

import java.util.Scanner;

public class Prime_range {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n, min,max,count=0;
		System.out.print("enter the min value:");
		min=s.nextInt();
		System.out.print("Enter the max value: ");
		max=s.nextInt();
		System.out.print("prime numbers are: ");
		for( n=min;n<=max;n++) {
			count=0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					count++;
					break;
				}
			}
		
		if(count==0&& n!=1)
			System.out.print(n+" ");
			s.close();
		}
		
		}
		
		

	}


