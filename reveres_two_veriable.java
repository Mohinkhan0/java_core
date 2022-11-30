import java.util.Scanner;
class reveres_two_veriable
{
 public static void main(String args[])
 {
   int a,b;
   // we are swapping two variables without using third variable
   
   Scanner sc=new Scanner(System.in);
   System.out.println("enter first number");
   a=sc.nextInt();
   System.out.println("enter first number");
   b=sc.nextInt();
   a=a-b;
   b=a+b;
   a=b-a;
   System.out.println("a= "+ a);
   System.out.println("b= " +b);
 }
}