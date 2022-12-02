import java.util.Scanner;
class salesman
{
 	 public static void main(String [] args)
	{
	 Scanner sc=new Scanner(System.in);
 	 System.out.println("enter sales ammount");
	 int amount=sc.nextInt();
         if(0<=100000)
	  {
 	    double comission=amount*12/100;
	    System.out.println("COMMISSION IS=" + comission);
	  }
          else if(100000<=200000)
	  {
 	    double comission=amount*19/100;
	    System.out.println("COMMISSION IS=" + comission);
	  }
	  else
	  {
 	    double comission=amount*27/100;
	    System.out.println("COMMISSION IS=" + comission);
	  }

	}
}