package Arrays;

import java.util.Scanner;

public class Not_repeat_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,count=0,flag=0;
		System.out.print("enter the size of the array: ");
		n=s.nextInt();
		int arr[]=new int[n];
	//	int temp[]=new int[n];
		System.out.println("Enter the array elements: ");
		 for(int i=0;i<n;i++) {
			
			 arr[i]=s.nextInt();}
		 System.out.print("The elements are: ");
for(int i=0;i<n;i++) {
	count=0;
          for(int j=0;j<n;j++) {
        	  if(arr[i]==arr[j]&&i!=j)
        		  
        		  count++;
          }
        	  if(count==0) {
        		  System.out.print(arr[i]+" ");
        	  flag=1;
}}
if(flag==0)
	System.out.println("All are repeated");
		
	s.close();
}
	
	}

