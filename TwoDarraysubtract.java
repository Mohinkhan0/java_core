import java.util.*;
class TwoDarraysubtract
{
 public static void main(String[] args)
{
  int row,col,i,j;
  Scanner sc=new Scanner(System.in);
  int array1[][]=new int [100][100];
  int array2[][]=new int [100][100];
  int sub[][]=new int [100][100];
  System.out.println("enter noumber of rows");
  row=sc.nextInt();
  System.out.println("enter noumber of column");
  col=sc.nextInt();
  System.out.println("enter first array values   " + row*col);
  for(i=0 ; i<row ; i++)
  {
  	 for(j=0 ; j<col ; j++)
   	{
    		array1[i][j]=sc.nextInt();
   	}
  }

  for(i=0 ; i<row ; i++)
  {
   	for(j=0 ; j<col ; j++)
   	{
    		System.out.println(array1[i][j] + " ");
   	}
     System.out.println("");
  }

  System.out.println("enter Second array values   " + row*col);
  for(i=0 ; i<row ; i++)
  {
   	for(j=0 ; j<col ; j++)
   	{
    		array2[i][j]=sc.nextInt();
   	}
  }


  for(i=0 ; i<row ; i++)
  {
   	for(j=0 ; j<col ; j++)
   	{
    		System.out.println(array1[i][j] + " ");
   	}
        System.out.println("");
  }

  System.out.println("- - - - - - - - - -  - - -- - - - - - - - --- - - - -- -- - - - ");

   System.out.println("your subtract array");
  for(i=0 ; i<row ; i++)
 {
  	for(j=0 ; j<col ; j++)
  	{
   		sub[i][j] = array1[i][j] - array2[i][j];
  	}
 }

  for(i=0 ; i<row ; i++)
  {
   	for(j=0 ; j<col ; j++)
   	{
    		System.out.print(sub[i][j] + " ");
   	}
   	System.out.println("");
  }

}
}