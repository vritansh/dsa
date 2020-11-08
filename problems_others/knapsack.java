import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class knapsack {

    public static int knapsack(int[] value, int[] weight, int w, int n)
    {
        if(n==0||w==0)
            return 0 ; 
        if(weight[n-1] <= w)
            
            return Math.max(value[n-1] + knapsack(value,weight, w-weight[n-1], n-1), knapsack(value,weight,w, n-1));
        else
           return knapsack(value, weight, w, n-1);


    }
    public static void main(String[] args) throws IOException
    {
  
     InputStreamReader r=new InputStreamReader(System.in);    
      BufferedReader br=new BufferedReader(r); 
      int item = Integer.parseInt(br.readLine());  
      String[] w = br.readLine().trim().split(" "); 
      String[] v= br.readLine().trim().split(" ");
      int[] weight = new int[item];
      int[] value = new int[item];
        
      for(int i =0 ;i<item;i++)
      {
        weight[i] = Integer.parseInt(w[i]);
        value[i] = Integer.parseInt(v[i])   ;
      }
        int target = Integer.parseInt(br.readLine());
        // int val[] = new int[]{60, 100, 120}; 
        // int wt[] = new int[]{10, 20, 30}; 
        // int  W = 50; 
        // int n = val.length; 
        // System.out.println(knapsack(val,wt,W,n));  
      
      System.out.println(knapsack(value, weight, target , item)) ;
    
    }

}