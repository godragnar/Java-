package basics;

import java.util.Scanner;

public class Greatest2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int p=s.nextInt();
	int q=s.nextInt();
	s.close();
	if(p>q) {
		System.out.println(p+" is greatest");
	}
	else {
		System.out.println(q+" is greatest");
	}
	}
}
