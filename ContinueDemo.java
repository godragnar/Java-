//program to calculate the sum of only positive numbers entered by user
package basics;

import java.util.Scanner;

public class ContinueDemo {
	public static void main(String[] args) {
		Double number,sum=0.0;
        Scanner input = new Scanner(System.in);
        
      while (true) {
      System.out.print("Enter a number: ");
      number = input.nextDouble();
      if (number <0.0) {
          continue;
  }
      sum+=number;
      System.out.println("Sum = " + sum);
	}
    

}
}
