import java.util.*;
class arrayreverse
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
  	 int array[]=new int [5];
	 System.out.println("enter five values");
	 int l=array.length;
	 for(int i=0 ; i<l ; i++)
	  {
	    array[i]=sc.nextInt();	
	  }
	  for(int i=0 ; i<l ; i++)
	   {
	    System.out.print(array[i] + "\t");
	   }
	   System.out.println("");
	   for(int i=l-1; i>=0 ; i--)
 	    {
	     System.out.print(array[i] + "\t");	
	     }
	}
}