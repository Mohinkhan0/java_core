import java.util.*;
public class Add_digits 
{
     public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
     System.out.println("enter any number");
     int num=sc.nextInt();
     int sum=0;
      for(int i=1 ; num>0; i++)
      {
         sum=sum+(num%10);
          num=num/10;
      }
      System.out.println(+sum);
     }
}
