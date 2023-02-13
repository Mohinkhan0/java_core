import java.util.Scanner;
class Demo
{
    // hieraricha inheritance program
    Scanner input = new Scanner(System.in);
    private int  num1,num2,sum;
    void getdata()
    {
   
    System.out.println("enter first number");
    num1=input.nextInt();
    System.out.println("enter second number");
    num2=input.nextInt();
    }
    public int sum1()
    {
         sum=num1+num2;
         return sum;
    }
}
class  Subclass1 extends Demo
{
 private int num3,div;
  void getdata()
  {
    super.getdata();
    System.out.println("enter third number for div");
    num3=input.nextInt();
    }
    void divide()
    {
        div=sum1()/num3;
        System.out.println("your division"+ div);
    }

}
class Subclass2 extends Demo
{
    Scanner input = new Scanner(System.in);
    private int num4,result;
    void getdata()
    {
        super.getdata();
         System.out.println("enter fourth number for mul");
         num4=input.nextInt();    
    }
    void multiply()
    {
        super.sum1();
      result=sum1()*num4;
      System.out.println("multiply result=" + result);
    }
}

public class Herarichal_Inheritance 
{
    
   public static void main(String[] args) 
   {
    Subclass1 obj=new Subclass1();
    Subclass2 obj1=new Subclass2();
     obj.getdata();
    obj.divide();
    obj1.getdata();
    obj1.multiply();
   } 
}
