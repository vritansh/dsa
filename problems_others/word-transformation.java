import java.util.*; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HelloWorld{
    static long  transformString(String s1, String s2, int l1, int l2)
    {
        
  if(l1==s1.length())
  return s2.length() -l2;
  if(l2 == s2.length())
  return s1.length() -l1; 
   if(s1.charAt(l1)== s2.charAt(l2) )
    return transformString(s1,s2,l1+1,l2+1);
    long insert = 1 +   transformString(s1, s2, l1 +1  ,  l2  );
    long delete = 1 +   transformString(s1, s2, l1,  l2+1  );
     long update = 1 +   transformString(s1, s2, l1 +1,  l2 +1 );

    return Math.min(insert, Math.min(delete,update));
 
    //delete-> second string increases the counter by 1 as the values after the deletion will make the strings as equal. 
    //insert -> second string counter remains the same the first string counter is more
    //update -> both the counters are incremented by 1. 
    
    
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
    System.out.println("Minimum operations required  is : " +transformString(s1,s2,0,0)) ; 
      
      
        }
        catch(Exception e)
        {
                System.out.println(e);
        }

     }
}
