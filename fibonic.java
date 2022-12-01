import java.util.*;
class fibonic
{
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
	int f=0,s=1,term, n;
	System.out.println("enter first value");
	term=sc.nextInt();
	if(term==1)
	System.out.print(f);
	else if(term==2)
	System.out.print(f + "" + s);
	else
	{
	System.out.print("Fibonacie Series Are:"+ f + " "+ s);
	term=term-2;
	while(term>0)
	{
	 n=f+s;
	System.out.print(" " +n);
	f=s;
	s=n;
	term--;
	}
	}
	}
}