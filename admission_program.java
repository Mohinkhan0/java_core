import java.util.Scanner;
class admission_program
{
   public static void main(String [] args)
   {
     Scanner sc=new Scanner(System.in);
      System.out.println(" enter physics number");
      int phy=sc.nextInt();
      System.out.println(" enter chemistry number");
      int chem=sc.nextInt();
      System.out.println(" enter maths number");
      int math=sc.nextInt();
      if((phy>=80) && (chem>=70) && (math>=75))
      System.out.println("YOUR ADDMISSION IS POAIBLE");
      else
      System.out.println("ADMISSION IS NOT POSIBLE");
     } 
}
