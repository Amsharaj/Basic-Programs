package Matrix;

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			int row = 3;
			int col = 3;
			int b[][]=new int[row][col];
			System.out.print("enter the b matrix:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					b[i][j]=s.nextInt();
				}
			}
			System.out.println("2D Bmatrix");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(b[i][j]+" ");
					
				}
				System.out.println();
			}s.close();
	}}
	


