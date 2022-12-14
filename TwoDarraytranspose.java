import java.util.*;
class TwoDarraytranspose
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int row,col,i,j;
    int array1[][]=new int[100][100];
    System.out.println("enter number of rows");
    row=sc.nextInt();
    System.out.println("enter number of column");
    col=sc.nextInt();
    for(i=0 ; i<row ; i++)
    {
     for(j=0 ; j<col ;j++)
     {
       array1[i][j]=sc.nextInt();
     }
     System.out.println("");
    }
    for(i=0 ; i<row ; i++)
    {
     for(j=0 ; j<col ;j++)
     {
       System.out.print(array1[i][j]+ " ");
     }
      System.out.println("");
    }
    System.out.println("**********************************************************************");
    System.out.println("your transpose is ");
   
    for(i=0 ; i<row ; i++)
    {
     for(j=0 ; j<col ;j++)
     {
       System.out.print(array1[j][i]+ " ");
     }
      System.out.println("");
    }
}
}
