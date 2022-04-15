package basics;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter a number");
	int a=s.nextInt();
	if(a%2==0) {
		System.out.println(a+" is a even number");
		
	}
	else {
		System.out.println(a+ "is a odd number");
	}
}
}
