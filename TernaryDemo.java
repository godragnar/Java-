package basics;

import java.util.Scanner;

public class TernaryDemo {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a=10000,b=200,max;
	System.out.println("First Number "+a);
	System.out.println("Second Number "+b);
	s.close();
	max=(a>b) ? a:b;
	String msg=(a > b)?"A is Greatest":"B is Greatest";
	System.out.println("The max of 2 No's is :"+max +" . "+msg);
}
}
