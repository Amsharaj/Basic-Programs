package Arrays;

import java.util.Scanner;

public class Occurrence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,temp,count=0;
		System.out.print("Enter no. of elements you want in array:");
		n=s.nextInt(); 
		System.out.print("Enter all the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.print("Enter the element of which you want to count number of occurrences:");
		temp=s.nextInt();
		for(int i=0;i<n;i++) {
			if (arr[i]==temp)
				count++;
			
		}
		
        	 
	
          if(count==0)
        	  System.out.println("Element not present");
          else
        	  System.out.println("Number of occurrence of the element: "+count);
         s.close();

	}

}
