//// Java Program to demonstrate 2-D Arrays.
package basics;

public class MatrixDemo {
public static void main(String[] args) {
	int a[][]={ {11,22,33},
			{22,33,44},
			{77,11,66} };
	int b[][]= { {44,11,22},
			{22,33,44},
			{11,33,44} };
    
    int c[][]=new int[3][3]; 
	
for(int p=0;p<3;p++)
{
	for(int q=0;q<3;q++)
	{
		c[p][q]=a[p][q] + b[p][q];//Addition of 2matrices
		System.out.print(c[p][q]+" ");
	}
	System.out.println();
		
	}
}
}
