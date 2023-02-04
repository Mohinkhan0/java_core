import java.util.Scanner;

class Sum1  // first class  of programm
{
    private int num1;
    private int num2, sum;
   public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        num1=sc.nextInt();
        System.out.println("enter second number");
        num2=sc.nextInt();
    }
    int sum()
    {
        return sum=num1+num2;
    }
    void show()
    {
        System.out.println("first  number "+ num1 + "second number " + num2);
    }
    
}

class Multiply extends Sum1    // second  class and we are inharit the property of class first
{
   private int num3,result;
    public void getdata()
   {
    super.getdata();
    System.out.println("enter Third number for multiply");
    Scanner sc=new Scanner(System.in);
    num3=sc.nextInt();
   } 
    int mul()
    {
        return result=sum()*num3;
    }
    void display()
    {
        System.out.println(" your first subclass result " + result);
    }
}
class Minus extends Multiply   // sthird  class and we are inharit the property of class first,second
{
  private int num4,fresult;
  public void getdata()
  {
     super.getdata();
     Scanner Sc=new Scanner(System.in);
     System.out.println("enter fourth number for minus");
     num4=Sc.nextInt();
  }
    void min()
  {
    fresult=mul()-num4;
    System.out.println(fresult);
  }
}
public class Multiple_inheritance  // main class of program
{
    public static void main(String[] args) 
    {
      Sum1 obj=new Sum1();  
      Multiply obj1=new Multiply();
      Minus obj2=new Minus();
    //  obj.getdata();
    //  obj1.getdata();
    //  obj1.display();
      obj2.getdata();
      obj2.min();
    }
}
