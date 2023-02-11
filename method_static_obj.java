 import java.util.*;
/*class method_ststic_obj
{
      void  display()
    {
     System.out.println("no return with no argument");
    }
    int square(int n)
    {
           return n*n;
    }
    public static void main(String[] args)
    {
      int result;
      Scanner sc=new Scanner(System.in);
      method_ststic_obj obj=new method_ststic_obj();
      System.out.println("enter any number");
      int a=sc.nextInt();
      obj.display();
      result=obj.square(a);
      System.out.println(result);
    }
}
  NOTE ->  if our method is static so we can call method without object.
       ->   otherwise we will create a object.
       ->   its example 
*/
class method_ststic_obj
{
     static void  display()
    {
     System.out.println("no return with no argument");
    }
    int square(int n)
    {
           return n*n;
    }
    public static void main(String[] args)
    {
      int result;
      Scanner sc=new Scanner(System.in);
      method_ststic_obj obj=new method_ststic_obj();
      System.out.println("enter any number");
      int a=sc.nextInt();
      display();
      result=obj.square(a);
      System.out.println(result);
    }
}