import java.math.*;
public class DataType 
{
    public static void main(String[] args) 
    {
     byte b=25;  // its range -128 to 127
     int a=50;    //-2147483648 to 2148483647
     short s=4535;  //-32768 to32767
     int i=42536481;    
     int j='A';    // it print ASCII value of A.
     float f= 45.5f; // if we will take any float value so we write tha f.
     char c='k';
    // char c='mohin';   it is a String so it will not receved;

      String str="hallow";
      String str1="f";
      int arr[]={5,2,8};
      
      Integer in=2564;
      System.out.println(in);
      BigInteger big = new BigInteger("25648123654");  // big integer is used to take large noumber of data 
      BigInteger big_1 = new BigInteger("25497");
       big.add(big_1);
      System.out.println( big.add(big_1));

   //    System.out.println(str);
  //    System.out.println(c);

     double d= 4581.23; //
  /* System.out.println(s);
     System.out.println(b);
     System.out.println(i); 
     System.out.println(j); 
     System.out.println(f); 
     System.out.println(d);
     */
    }
}
