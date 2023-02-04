import java.util.Scanner;

class Rectengle    // its super class (Externl class)
{
    private int l,b;
    public void getdata() // now we are getting the  input data 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
         l=sc.nextInt();
         System.out.println("enter breath");
         b=sc.nextInt();
    }
    public int area()  // calculatig  the data in area  
    {
        return l*b;  // 
    }
    public void display()  // it also diplay method 
    {
        System.out.println("length=  " + l +  "   " + "breath=  " + b);
    }
    
}

class Cuboid extends Rectengle  // its subclass (using extends keyword to get property of of superclass )
    { 
        private int h;
        public void getdata()
        {
            super.getdata();   //  super.get data is using to fetch the data in super calss getdata method 
            System.out.println("enter height");
            Scanner sc=new Scanner(System.in);
            h=sc.nextInt();
        }
        public void volume()
        {
          int v;
          v= area()*h;
          System.out.println(v);
        }
        public void show()
        {
         super.display();
         System.out.println("heinght=" + h);
        }
    }
public class Inheritance_problem  // its main class
{
    public static void main(String[] args)
     {
      Cuboid cd=new  Cuboid(); // create cuboid object in cd
      cd.getdata();  // call getdata method 
      cd.show();    // cal show  method 
      cd.volume();  // also call volume method
    }
}
