package Day6;

import java.util.Scanner;

public class Switch_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark1,mark2,mark3;
		float total,avg;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the student id:");
		System.out.print("Enter the Student name:");
		System.out.print("Enter the mark1:");
mark1=s.nextInt();
System.out.print("Enter the mark2:");
mark2=s.nextInt();
System.out.print("Enter the mark3:");
mark3=s.nextInt();
total=mark1+mark2+mark3;
avg=total/3;
if(avg>=90)
	System.out.print("Excellent");
else if(avg>=80)
	System.out.print("Very good");
else if(avg>=70)
	System.out.print("Good");
else if (avg>=60)
	System.out.print("Improve");
else if (avg>=50)
	System.out.print("poor");
else if (avg>=40)
	System.out.print("very poor");
else
	System.out.print("not eligible");
s.close();
	}

}
