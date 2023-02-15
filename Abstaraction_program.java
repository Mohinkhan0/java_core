import java.util.Scanner;

abstract class Demo
{
      // its  complete program because its not doing abstract 
      // 
    abstract void getdata();
}
class  Subclass1 extends Demo
{
  void getdata()
  {
    int num1,num2,sum;
    Scanner input=new Scanner(System.in);
    System.out.println("enter firts  number ");
    num1=input.nextInt();
    System.out.println("enter firts  number ");
    num2=input.nextInt();
    sum=num1+num2;
    System.out.println(sum);
  }
   public static void main(String[] args)
   {
     Subclass1 obj=new Subclass1();
     obj.getdata();
   }
}
