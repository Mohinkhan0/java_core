public class CountDigit 
{
    public static void main(String[] args)
    {
      int num=1236,count=0;
      for(int i=num; num>0; i--)
      {
       num=num/10;
       count++;
      }
     System.out.println(count);
    }
}
