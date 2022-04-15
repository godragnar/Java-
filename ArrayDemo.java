package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
public static void main(String[] args) {
	
	int[] num= {10,20,30,40,50};
	int i;
	System.out.println("*********Array Contents*********");
	for(i=0;i<num.length;i++)
	{
		System.out.println(num[i]);
		
	}
	System.out.println("The length of the Array is :"+num.length);
	System.out.println("First Element of the Array is :"+num[0]);
	System.out.println("The Last Element of the Array is :"+num[num.length-1]);

	System.out.println("*****************************");
	    int n,j;
	    Scanner s= new Scanner(System.in);
	    System.out.println("Enter 2nd Array Length:");
 	    n=s.nextInt();
	    int num1[] =new int[n];
	    System.out.println("Enter Array Elements");
	    for(j=0;j<=n;j++)
	     {
		  num1[j]=s.nextInt();
		 }
	    System.out.println("*************2nd Array Contents*************");
	    for(j=0;j<num.length;j++) 
	    {
		   System.out.println(num1[j]+ " ");
		
		 }
	System.out.println();
	System.out.println("Display Array Contents Without Loop");
	System.out.println(Arrays.toString(num1));
	
	
	s.close();
	
	}

	
}
