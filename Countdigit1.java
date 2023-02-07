import java.util.*;
class Countdigit
{
	public static void main(String []args)
	{
          Scanner sc=new Scanner(System.in);
	  {
	     int count=0;
             System.out.println("enter any number");
              int num=sc.nextInt();
              for(int i=1; num>0 ;  i++)
		{
		 num=num/10;
                  count++;
		}
		System.out.println(+count);
	  }
	}	
 }