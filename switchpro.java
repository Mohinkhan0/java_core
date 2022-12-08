import java.util.*;
class switchpro
{
   public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" press 1 for check even odd");
        System.out.println(" press 2 for check prime number");
        System.out.println(" press 3 for check grater");
        System.out.println(" press 4 for check swap value");
        System.out.println(" enter your choice");
        int ch=sc.nextInt();
        switch(ch)
        {
	 case 1:
		System.out.println("enter any number");
		int a=sc.nextInt();
		if(a%2==0) 
		  System.out.println("number is even" +a);
		else
		  System.out.println(" press 1 for check even odd"); 
   	}
    }
}