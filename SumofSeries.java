package basics;

import java.util.Scanner;

public class SumofSeries {
	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of N:");
		n=s.nextInt();
		while(i<=n) {
			sum+=i;
			//System.out.println(sum);
			i+=1;
		}
		System.out.println("The sum of Series is "+sum);
	}

}
