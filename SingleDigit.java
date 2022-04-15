package basics;

import java.util.Scanner;

public class SingleDigit {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int p=s.nextInt();
	if(p>=-9 && p<=9) {
		System.out.println(p+"is a single digit number");
	}
	else {
		System.out.println(p+"is not a single digit number");
	}
}

}
