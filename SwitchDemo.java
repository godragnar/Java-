package basics;

import java.util.Scanner;

public class SwitchDemo {
public static void main(String[] args)
{
	int a,b,res;
	String op;
	Scanner s=new Scanner(System.in);
	System.out.println("enter 2 numbers");
	a=s.nextInt();
    b=s.nextInt();
    s.close();
    System.out.println("Enter any Arthimetic Operator:");
    op=s.next();
	switch(op) {
	case "+":res=a+b;
	         System.out.println("The Addition is :"+res);
	         break;
	case "-":res=a-b;
             System.out.println("The Substarction is :"+res);
             break;
	case "*":res=a*b;
             System.out.println("The Multiplication is :"+res);
             break;
	case "/":res=a/b;
             System.out.println("The Divison is :"+res);
             break;
}        

}
}
