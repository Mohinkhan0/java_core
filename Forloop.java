public class Forloop 
{
    public static void main(String[] args) 
    {
        // its prime number program; if number devisible by 1 and itself; and check number of iterations
        int num=997;
        boolean prime=true;
        int iter=0;
        for(int i=2 ; i*i <num ; i++)
        {
            iter++;
            if(num%i==0)
            {
              //  System.out.println("not prime....");
              prime=false;
              break;
            }
           // else{
          //      System.out.println("prime....");
          //  }
        }
        if(prime){
            System.out.println("number is prime");
        }
        else{
            System.out.println("not prime");
        }
        System.out.println("iteration"+iter);
    }
}
