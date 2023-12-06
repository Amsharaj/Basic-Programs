package Arrays;

import java.util.Scanner;

public class One_increment {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		//System.out.print("enter the number of element:");
		n=s.nextInt();
		int arr[]=new int[n];
		 for(int i=0;i<n;i++) 
			 arr[i]=s.nextInt()+1;
		 for(int i=0;i<n;i++) {
			 System.out.println(arr[i]);
			
		 }s.close();
			 
			 
		 }
		
		
		
		
	}


