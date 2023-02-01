import java.util.*;
class Copy_constructor
{
    private int ID;
    private String Name;
    Copy_constructor(int id, String name)
    {
        ID=id;
        Name=name;
    }
    Copy_constructor(Copy_constructor obj)  // its constructor
    {
        System .out.println("*******************copy constructor start**************************************");
        ID=obj.ID;
        Name=obj.Name;
    }
     int ShowId()
    {
      return ID;
    }
     String ShowName()
    {
        return Name; 
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter id=");
      int id=sc.nextInt();
      System.out.println("enter name=");
      String name=sc.next();
      Copy_constructor I=new Copy_constructor(id,name);
      System.out.println("id="+I.ShowId());
      System.out.println("name="+I.ShowName());
      Copy_constructor IC=new Copy_constructor(I);
      System.out.println("copy constructor id="+I.ShowId());
      System.out.println("copy constructor name="+I.ShowName());
    }
}