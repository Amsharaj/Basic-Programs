package Arrays;

import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("enter the number of element:");
		n=s.nextInt();
		int arr[]=new int[n];
		 for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
		int pos=n/2;
		 for(int i=0;i<pos;i++)
			 System.out.println("first array=" +arr[i]);
		 for(int i=pos;i<n;i++)
		 System.out.println("second array="+arr[i]);
		 s.close();

	
}
}