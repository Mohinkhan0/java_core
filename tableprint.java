import java.util.Scanner;
class tableprint
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("enter any number");
    int n=input.nextInt();
    for(int i=1;i<10;i++)
     {
        int table=n*i;
        System.out.println( +n + "x" + i + "=" + table);
       } 

  }
}