import java.util.Scanner;
class festivel_discount
{
	public static void main(String [] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter your coast");
	 int amount=sc.nextInt();
	 if(0<2000)
	  {
	   double discount=amount*5/100;
	   System.out.println(" DISCOUNT is =" + discount);
	   }
	 else if(2001<5000)
	  {
	   double discount=amount*25/100;
	   System.out.println(" DISCOUNT is =" + discount);
	   }
	 else if(5001<10000)
	  {
	   double discount=amount*35/100;
	   System.out.println(" DISCOUNT is =" + discount);
	   }
	  else
	  {
	   double discount=amount*50/100;
	   System.out.println(" DISCOUNT is =" + discount);
	   }
	}
}