package basics;

import java.util.Scanner;

public class StudentResult {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student Rollno");
		int Rollno=s.nextInt();
		System.out.println("Enter the Student name");
		String name=s.next();
		System.out.println("Enter the marks of 5 subjects");
		float m1=s.nextFloat();
		float m2=s.nextFloat();
		float m3=s.nextFloat();
		float m4=s.nextFloat();
		float m5=s.nextFloat();
		float total=m1+m2+m3+m4+m5;
		float agg=(10*total)/500;
		System.out.println("Roll number is " +Rollno);
		System.out.println("Student Name is " +name);
		System.out.println("Total Marks " +total);
		System.out.println("Aggregate " +agg);
		if(agg > 8.5)
		{System.out.println("Result : Distinction");}
		else if(agg>=7 && agg<8.5)
		{
			System.out.println("Result : First Class");
		}
		else if(agg>=5 && agg<7)
		{
			System.out.println("Result : Second Class");
		}
		else if(agg>=4 && agg<5)
		{
			System.out.println("Result : Pass Class");
		}
		else
		{
			System.out.println("Result : Fail");
		}
			
		}
	}


