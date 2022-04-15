package basics;

import java.util.Scanner;

public class SumofPositive {
	public static void main(String[] args) {
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=input.nextInt();
		while(number>=1) {
			sum+=number;
			System.out.println("Enter a number:");
			number=input.nextInt();
		}
		System.out.println("sum ="+sum);
		input.close();
	}

}
