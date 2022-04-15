package basics;

public class DoWhileDemo1 {
	public static void main(String[] args)
	{
	System.out.println("**********Multiplication Table*********\t");
	int row,column;
	row=1;
	do 
	{
		column=1;
		do 
		{
			int mul=row*column;
			System.out.println(mul+"\t");
			column+=1;
		}while(column<=5);
		
		System.out.println();
		row=row+1;
	}while(row<=5);
   }


}
