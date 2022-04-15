package basics;

import java.util.Scanner;

public class Greatest3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int p=s.nextInt();
		int q=s.nextInt();
		int r=s.nextInt();
		if(p>q && p>r) {
			System.out.println(p+" is greatest");
		}
		else if(p==q && p>r && q>r) {
			System.out.println("p and q are equal");}
		else if(q>r) {
			System.out.println(q+" is greatest");
		}
		else if(p==q && q==r) {
			System.out.println("All numbers are equal");}
		else if(p==q) {
			System.out.println("p and q ae equal");
		}
			else if(p==r) {
	        System.out.println("p and r are equal");
		}
		else {
			System.out.println(r+" is greatest");
		}
		s.close();
		
	}

}
