import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays ; 

public class KnapsackMemoize
{

    public static int knapsackMemoize(int[] value, int[] weight, int w, int n)
    {    int[][]  t = new int[n+1][w+1];
        for(int i =0 ;i<n+1;i++)
            for(int j =0 ;j<w+1;j++)
                    t[i][j] = -1 ;
        if(n==0||w==0)
        //Do nothing because of base condition ignored
            return 0 ; 
        
        if(t[n][w]!=-1)
            return t[n][w] ;
        
        if(weight[n-1] <= w)

            t[n][w] = Math.max(value[n-1] + knapsackMemoize(value,weight, w-weight[n-1], n-1), knapsackMemoize(value,weight,w, n-1));     

        else
               t[n][w]= knapsackMemoize(value, weight, w, n-1);
         
        return t[n][w]; 

    }


public static void main (String args[]) throws IOException 
{
    // Uncomment below for customizerd input
    // InputStreamReader r=new InputStreamReader(System.in);    
    // BufferedReader br=new BufferedReader(r); 
    //  int item = Integer.parseInt(br.readLine());  
    //  String[] w = br.readLine().trim().split(" "); 
    //  String[] v= br.readLine().trim().split(" ");
    //  int[] weight = new int[item];
    //  int[] value = new int[item];
       
    //  for(int i =0 ;i<item;i++)
    //  {
    //    weight[i] = Integer.parseInt(w[i]);
    //    value[i] = Integer.parseInt(v[i])   ;
    //  }
    //    int target = Integer.parseInt(br.readLine());
    // System.out.println(knapsackMemoize(value, weight, target , item)) ;
       int val[] = new int[]{60, 100, 120}; 
       int wt[] = new int[]{10, 20, 30}; 
       int  W = 50; 
       int n = val.length; 
           System.out.println(knapsackMemoize(val,wt,W,n));        
  

}



}