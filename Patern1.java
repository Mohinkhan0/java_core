public class Patern1 
{
    public static int i;
    public static void main(String[] args) {
        int n=5;
         for( i=1 ; i<=n ; i++)
        {
            for(int j=1; j<=i ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    
        for( i=1 ; i<=n ; i++)
        {
            for(int j=1; j<=n-i ;j++)
            {
                System.out.print("*");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
         /*
              *
              **
              ***
              ****
              ***
              **
              *
          */
    }
}

