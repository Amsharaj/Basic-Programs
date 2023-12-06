package Arrays;

import java.util.Scanner;

public class Sort_ascending {

	public static void main(String[] args) {
		int n,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
			arr[i]=s.nextInt();
		for (int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if (arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						}
				}
			
			}
		System.out.print("ascen: ");
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");		
		//decending		
		System.out.print("\n5dicen: ");
		for(int i=n-1;i>=0;i--)
			System.out.print(arr[i]+" ");			
					s.close();			
			}
	
		

	
}

