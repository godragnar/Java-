package basics;

public class JumpDemo {
	public static void main(String[] args) {
		int i,j;
		   
        System.out.println("********** Break Demo ***********");
       
        for(i=1;i<=10;i++)
        {
            if(i==5)
            {
                   break;
            }
           
            System.out.println(i+" Sai");
        }
           
        System.out.println("********** Continue Demo ***********");
       
        for(j=1;j<=10;j++)
        {
            if(j==4)
            {
                continue;   
            }
           
            System.out.println(j+" Kiran");
        }
       
	}
}
