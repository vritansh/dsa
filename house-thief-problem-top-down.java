import java.util.*; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HelloWorld{
    static int  makeTheft(int[] arr, int currIndex)
    {
        
if(currIndex>=arr.length)
        return 0;
int[] dp = new int [arr.length];
if(dp[currIndex]==0)
{
    int stealCurrentHouse = arr[currIndex] + makeTheft(arr, currIndex+2);
    System.out.println("Current  ->  " + stealCurrentHouse);
    int stealAlternativeHouse = makeTheft(arr, currIndex+1);
    
    System.out.println("Alternative  -> "+ stealAlternativeHouse);
    dp[currIndex] =  Math.max(stealCurrentHouse,stealAlternativeHouse ); 
}
return dp[currIndex];
    
    }
    
         public static void main(String []args){
             
        try
        {
             
             
            InputStreamReader r=new InputStreamReader(System.in);    
      BufferedReader br=new BufferedReader(r); 
      String[] s = br.readLine().trim().split(" "); 
      int[] arr = new int[s.length];
      System.out.println(s);
      for(int i =0 ;i<s.length;i++)
      {  
            arr[i] = Integer.parseInt(s[i]);
      }
    System.out.println("Stolen property is : " + makeTheft(arr,0)); 

        }
        catch(Exception e)
        {
                System.out.println(e);
        }
      
     }
}
