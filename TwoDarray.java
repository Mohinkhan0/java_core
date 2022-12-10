import java.util.*;
class TwoDarray
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int array1[][]=new int[3][3];
 int array2[][]=new int[3][3];
 int mul[][]=new int[3][3];
int i,j;
 System.out.println("enter first array values");
 for( i=0 ; i<3 ; i++)
 {
  for(j=0 ; j<3 ; j++)
  {
   array1[i][j]=sc.nextInt();
  }
  System.out.println("");
 }
 for( i=0 ; i<3 ; i++)
 {
  for( j=0 ; j<3 ; j++)
  {
   System.out.print(array1[i][j] + " ");
  }
  System.out.println("");
 }


 System.out.println("enter second array values");
 for(i=0 ; i<3 ; i++)
 {
  for( j=0 ; j<3 ; j++)
  {
   array2[i][j]=sc.nextInt();
  }
  System.out.println("");
 }
for( i=0 ; i<3 ; i++)
 {
  for( j=0 ; j<3 ; j++)
  {
   System.out.print(array2[i][j] + " ");
  }
  System.out.println("");
 }

System.out.println(" your multiplied array is");
for(i=0 ; i<3 ; i++)
 {
  for(j=0 ; j<3 ; j++)
  {
   mul[i][j]=array1[i][j]-array2[i][j];
  }
  System.out.println("");
 }
for(i=0 ; i<3 ; i++)
 {
  for( j=0 ; j<3 ; j++)
  {
   System.out.print(mul[i][j] + " ");
  }
  System.out.println("");
 }
}
}