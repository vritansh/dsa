import java.util.*; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HelloWorld{
    static int  maximizeProfit(int[] profit,int[] weight, int capacity,  int currIndex)
    {
          //Base Condition #1 -> Check if the capacity has become less than zero 
          // Base Condition #2 -> Check if currIndex is exceeding the length of array 
          if(capacity<=0 || currIndex>= profit.length)
                return 0;           
          
        int p1 = 0;
        if(weight[currIndex]<=capacity)
            p1 = profit[currIndex] + maximizeProfit(profit, weight, capacity - weight[currIndex], currIndex+1);
        System.out.println("Profit1 -> " + p1);    
        int p2 = maximizeProfit(profit, weight, capacity, currIndex+1);
        System.out.println("Profit2 -> " + p2);
    
        return Math.max(p1,p2);
    
    }
    
         public static void main(String []args){
             
        try
        {
             
             
            InputStreamReader r=new InputStreamReader(System.in);    
      BufferedReader br=new BufferedReader(r); 
      String[] s = br.readLine().trim().split(" "); 
      String[] t = br.readLine().trim().split(" "); 
      int[] profit= new int[s.length];
      int[] weight= new int[t.length];

      for(int i =0 ;i<s.length;i++)
      {  
            profit[i] = Integer.parseInt(s[i]);
      }
      
      for(int i =0 ;i<t.length;i++)
      {  
            weight[i] = Integer.parseInt(t[i]);
      }
      int capacity = Integer.parseInt(br.readLine()); 
    System.out.println("Maximum profit is  : " + maximizeProfit(profit, weight,capacity,0)); 

        }
        catch(Exception e)
        {
                System.out.println(e);
        }

     }
}
