
// https://www.geeksforgeeks.org/subset-sum-problem-dp-25/

class SubsetSum
{
public static boolean subsetSum(int[] value, int n,  int s)
{ 

    if(s ==0)
        return true  ;
    if (n ==0 )
        return false ; 
   if( value[n-1] > s )
            {
            return subsetSum(value,n-1,s);    
            }
    else 
    {
            return subsetSum(value, n-1 , s-value[n-1]) || subsetSum(value,  n-1, s );
        
    } 
    
}
public static void main(String args[]) 
{

int value[] = new int[]{3, 34, 4, 12, 5, 2};
int s = 8 ;

System.out.println(subsetSum(value,6, s));

}
}