import java.util.*;
class TwoDarraymul
{
 public static void main(String[] args)
{
  int row,col,i,j,k;
  Scanner sc=new Scanner(System.in);
  int array1[][]=new int [100][100];
  int array2[][]=new int [100][100];
  int mul[][]=new int [100][100];
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
   System.out.println("");
  }
  for(i=0 ; i<row ; i++)
  {
   for(j=0 ; j<col ; j++)
   {
    System.out.print(array1[i][j] + " ");
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
   System.out.println("");
  }
  for(i=0 ; i<row ; i++)
  {
   for(j=0 ; j<col ; j++)
   {
    System.out.print(array2[i][j] + " ");
   }
   System.out.println("");
  }
  System.out.println("**********************************************");
   System.out.println("your multiply array");
  for(i=0 ; i<row ; i++)
  {
   for(j=0 ; j<col ; j++)
     {
      for(k=0 ; k<row; k++)
       {
         mul[i][j]+= array1[i][k] * array2[k][j];
       }
     }
   System.out.println("");
  }
  for(i=0 ; i<row ; i++)
  {
   for(j=0 ; j<col ; j++)
   {
    System.out.print(mul[i][j] + " ");
   }
   System.out.println("");
  }
}
}