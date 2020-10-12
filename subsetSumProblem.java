
import java.io.*; 
public class subsetSumProblem {

    public static boolean isSubSumDp(int[] value, int sum, int n)
    {
        
        boolean[][] t = new boolean[n+1][sum+1];
        
        for(int i =0 ;i<n+1;i++)
        {
        for(int j=0 ;j<sum+1;j++)
        {
            if(i==0)
             t[i][j]=false;
            if(j==0)
              t[i][j] = true; 
        }
    }
        for(int i =0 ;i<n+1;i++)
        {
        for(int j=0 ;j<sum+1;j++)
            {
                if(value[i-1] <=j)
                    t[i][j]  = t[i-1][j-value[i-1]] || t[i-1][j];
                else
                    t[i][j] = t[i-1][j]; 
            }
        }        
        
    }





    public static boolean isSubsetSum(int[] value, int sum, int n)
    {
    
    if(sum==0||n== 0)
        return true; 
 
    if(value[n-1] <= sum)
        return (isSubsetSum(value,sum-value[n-1], n-1) || isSubsetSum(value,sum,n-1));
    
    return isSubsetSum(value,sum,n-1);

    }      
    public static void main(String[] args) throws IOException    
    {
  
     InputStreamReader r=new InputStreamReader(System.in);    
      BufferedReader br=new BufferedReader(r); 
      int tC = Integer.parseInt(br.readLine());  
      for(int t  =0;t<tC;t++)
      {     
      int sum = Integer.parseInt(br.readLine());  
      String[] v = br.readLine().trim().split(" "); 
       int n = v.length ; 
      int[] value = new int[n];
     
      for(int i =0 ;i<n;i++)
      {
        value[i] = Integer.parseInt(v[i])   ;
      }    
        if(isSubsetSum(value,sum,n))
            System.out.println("YES")  ;
        else
            System.out.println("NO");
        }
    }
}