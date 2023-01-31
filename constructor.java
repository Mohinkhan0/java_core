import java.util.*;
/*
   what is constractor ?

   -> constractor is assign tha value of a method if we will not use constructor
   so it take tha garbage value.

   -> constructor is assign a value of the varible.

   ## program of constractor;
 */
class demo
{
    int a,b,c;
    void getdata(int x, int y)
    {
        a=x;
        b=y;
        c=a+b;
    }
    void display()
    {
        System.out.println(+a +"+" +b +"=" +c);
    }
    demo()
    {
        a=0;
        b=0;
        c=0;
    }
    demo(int p, int q)
    {
        a=p;
        b=q;
        c=a+b;
    }
}
public class constructor
{
     public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      demo obj=new demo();
      obj.display();
      System.out.println("enter first number");
      int p=sc.nextInt();
      System.out.println("enter first number");
      int q=sc.nextInt();
      demo obj1=new demo(p,q);
      obj1.display();
    }
}