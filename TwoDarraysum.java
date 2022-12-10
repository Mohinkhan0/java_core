import java.util.*;
class TwoDarraysum
{
 public static void main(String[] args)
 {
  int row,col,i,j,sum=0;
  Scanner sc=new Scanner(System.in);
  int array[][]=new int[100][100];
  System.out.println("enter number of rows");
  row=sc.nextInt();
  System.out.println("enter number of column ");
  col=sc.nextInt();
  System.out.println("enter matrix value " + row*col);
  for(i=0 ; i<row ; i++)
  {
   for(j=0 ; j<col ; j++)
   {
     array[i][j]=sc.nextInt();
     sum=sum+array[i][j];
    }
   System.out.println("");
  }
  for(i=0 ; i<row ; i++)
  {
   for(j=0 ; j<col ; j++)
   {
     System.out.print(array[i][j]+" ");
    }
   System.out.println("");
  }
  System.out.println(sum);
 }
}
