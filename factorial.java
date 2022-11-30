import java.util.*;
class factorial
{
	public static void main(String[] args)
	{
             // in this program we can calculate factorial of any number
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		int fact=1;
		while(n>0)
		{
		 fact=fact*n;
		 n--;
		}
		System.out.println("FACTORIAL is=" + fact);
	}
}