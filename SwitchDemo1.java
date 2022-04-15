package basics;

import java.util.Scanner;

public class SwitchDemo1 {
public static void main(String[] args) {
	int number;
	String length;
	Scanner s=new Scanner(System.in);
    System.out.println("Enter your length:");
    number=s.nextInt();
    s.close();
    switch(number) {
    case 1:
    case 2:
    case 3:
    	length="Kids";
    	break;
    case 29:
    	length="Small";
    	break;
    case 42:
    	length="Medium";
    	break;
    case 56:
    	length="Large";
    	break;
    }
}
}
