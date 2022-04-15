package basics;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=s.nextInt();
	s.close();
	int i=1;
	System.out.println("The Multiplication Table of "+n+" is :     ");
	do {
		System.out.println(n+" * "+i+" = "+(n*i));
		i++;
	}while(i<=10);
	}

}