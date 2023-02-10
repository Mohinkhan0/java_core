//import java.util.*;
class method_overloading
{
    void sum()
    {
       System.out.println("empty" );
    }
    void sum(int a ,int b)
    {
        System.out.println("your sum" + (a+b) );
    }
    void sum(int n)
    {
        System.out.println("your sum" + n  );
    }
}
class method_overloading_sum_example
{
    public static void main(String []args)
    {
        method_overloading obj = new method_overloading();
        obj.sum();
        obj.sum(10,20);
        obj.sum(500);
    }
}