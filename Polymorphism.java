class Demo
{
   void sum()
   {
     System.out.println("there is no argumet to add");
   }
   int sum(int a , int b)
   {
      return a*b;
   }
   int sum(int a,int b,int c)
   {
    return a+b*c;
   }
   double sum(double a, int b)
   {
    return a-b;
   }
}
public class Polymorphism 
{
    public static void main(String[] args) 
    {
         /*  basially polymorphism two types 
             1: Runtime polymorphism 
             2: Compile time polymorphism 

             * RUNTIME POLYMORPHISM :
              -> runtime polymorphism is known as METHOD OVERRIDING ;
            
              *  COMPILE TIME POLYMORPHISM 
              -> compile timr polymorphism is known as METHOD OVERLOADING ; 
         */
        double db;
        Demo obj1=new Demo();
        obj1.sum();
        int  result=obj1.sum(5,10);
        System.out.println(result);
        result=obj1.sum(5, 6,10);
        System.out.println(result);
        db=obj1.sum(5.5,2);
        System.out.println(db);
    }
}
