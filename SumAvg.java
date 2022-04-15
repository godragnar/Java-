package basics;

import java.util.Scanner;

public class SumAvg {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a,b,c,sum,marks;
	float avg;
	String name;
	System.out.println("Enter your name");
	name=s.next();
	System.out.println("Enter your marks");
	marks=s.nextInt();
	System.out.println("Enter 3 Numbers:");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
    sum=a+b+c;
    System.out.println("the sum of 3 numbers is:"+sum);
    System.out.println("******************");
    avg=sum/3;
    System.out.println("the average of 3 numbers is:");
    System.out.println();
    System.out.format("%.3f",avg);
    System.out.println();
    System.out.format("%.2f",avg);
}
}
