package basics;

import java.util.Scanner;

//java program to find the area of the circle
public class Area {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float a,r;
		float PI=3.14f;
		System.out.println("Enter the radius of circle:");
		r=s.nextFloat();
		a=PI*r*r;
		System.out.println("The area of circle is "+a);
	    System.out.format("%.1f",a);
	    s.close();
	}

	
	}

