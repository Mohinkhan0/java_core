import java.util.*;
class employproblem
{
 private int id;
 private String name;
 private Double salary;
 void insert(int x, String y, Double z)
 {
  id=x;
  name=y;
  salary=z;
 }
 void display()
 {
  System.out.println(id);
  System.out.println(name);
  System.out.println(salary);
 }
}
class employ1
{
 public static void main(String[] args)
 {
   int i,id;
   String name;
   Double salary;
   Scanner sc=new Scanner(System.in);
   employproblem e[]=new employproblem[4];
   for(i=0; i<=4; i++)
   {
       System.out.println("enter id"); 
       id=sc.nextInt();
       System.out.println("enter name");
       name=sc.next();
       System.out.println("enter salary");
       salary=sc.nextDouble();
      e[i].insert(id,name,salary);
   }
   System.out.println("your data");
   for(i=0; i<=4; i++)
   {
     e[i].display();
   }
 }
}