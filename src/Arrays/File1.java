package Arrays;

import java.util.Scanner;

public class File1 {
	void printarray(int n,int arr[]) {
		System.out.println("array elements: ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		File1 obj=new File1();
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements one by one:");
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
		obj.printarray(n,arr);//method calling
		
			s.close();
		
	}

}
