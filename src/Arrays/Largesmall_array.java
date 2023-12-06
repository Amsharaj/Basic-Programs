package Arrays;

import java.util.Scanner;

public class Largesmall_array {

	public static void main(String[] args) {
		int n,large,small;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements one by one:");
		
		//large=arr[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();}
		large=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>large)
				large=arr[i];}
		small=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<small)
				small=arr[i];
			
			
		}
System.out.println("large="+large);
System.out.println("small="+small);
s.close();
	}

}
