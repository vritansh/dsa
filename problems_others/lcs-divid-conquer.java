import java.util.*; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
public class HelloWorld{
    static long  lcs(String s1, String s2, int l1, int l2)
    {
    if(l1==s1.length() || l2 == s2.length()) 
        return 0; 
    long c1 = 0 ;
    if(s1.charAt(l1) == s2.charAt(l2))
            c1 = 1 + lcs(s1,s2,l1+1,l2+1);
    long c2 = lcs(s1,s2,l1+1,l2);
    long c3 = lcs(s1,s2,l1,l2+1);
  return   Math.max(c1, Math.max(c2,c3))  ;  
    }    
 public static void main(String []args){    
        try
        {      
     InputStreamReader r=new InputStreamReader(System.in);    
      BufferedReader br=new BufferedReader(r); 
      String s1 = br.readLine();
      String s2 = br.readLine(); 
      System.out.println(s1);
      System.out.println(s2);
    System.out.println("Length of maximum common subsequence is : " +lcs(s1,s2,0,0)) ; 
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
}
}
