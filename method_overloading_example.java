/* NOTE ->    its method over loading method that means 
        ->    we are calling a same function but there are passing differnt 
              paramiters.
 
 */
class method_overloading
{
    void test()
    {
      System.out.println("no paramiter");
    }
    void test(int n)
    {
       System.out.println("your data is=" + n);
    }
    void test(int n , int m)
    {
       System.out.println(n*m);
    }
     double test(double n)
    {
        System.out.println(n);
        return n*n;
    }
}
class  method_overloading_example
{
    public static void main(String[] args)
    {
      double result;
      method_overloading obj=new method_overloading();
      obj.test();
      obj.test(10);
      obj.test(10,10);
      result=obj.test(5.00);
      System.out.println(result);
    }
}