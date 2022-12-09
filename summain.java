class sum
{
  private int a,b,c;
  void add(int x, int y)
  {
    a=x;
    b=y;
  }
  void result()
  {
    c=a+b;
    System.out.println("sum=" + c );
  }
}
// it is example of class and method
class summain
{
  public static void main(String [] args)
  {
   sum obj=new sum();
   obj.add(10,20);
   obj.result();
  }
}
