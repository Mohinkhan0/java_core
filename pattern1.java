class pattern1
{
	public static void main(String[]args)
	{
	 for( int i=1 ; i<=5 ; i++)
	  {
	   for(int j=1 ; j<=5 ; j++)
	   {	
	    if(j==5-i && i<5)
	    {
	     System.out.print(" ");
		int s=i;
		i--;
		}
	    else
		System.out.println(i); 
		}
	   System.out.println("");
	   }
	}
}