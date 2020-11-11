
// https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
public class SubsetSumMemoize
{
public static boolean subsetSum(int[] value, int n,  int s)
{ 
    
    boolean[][] t = new boolean[n+1][s+1];
    for(int i =0 ;i<n+1;i++)
            for(int j =0 ;j<s+1;j++)
                    t[i][j] = false ;

    if(s ==0)
        return true  ;
    if (n ==0 )
        return false ; 

    if(t[n][s] != false) 
        return t[n][s];

     if( value[n-1] > s )
            {
            return  t[n][s] =  subsetSum(value,n-1,s);    
            }
    
    else 
    {
            return t[n][s] =  subsetSum(value, n-1 , s-value[n-1]) || subsetSum(value,  n-1, s );
        
    } 
    
}
public static void main(String args[]) 
{
int value[] = new int[]{3, 34, 4, 12, 5, 2};
int s = 8 ;
System.out.println(subsetSum(value,6, s));
}
}