
// https://www.geeksforgeeks.org/partition-problem-dp-18/
class EqualSumPartitionMemoize{

    public static boolean isSubsetSum(int value[]  , int sum, int n )
    {
    
    //Add a variable to store the results of every iteration 
    boolean[][] t = new boolean[n+1][sum+1];
    for(int i =0 ;i<sum+1;i++)
        for(int j = 0 ;j<n+1;j++)
            t[i][j] = false;

     if(sum ==0 )
            return true;
     
     if(t[n][sum] != false) 
            return t[n][sum];
        
    if (n ==0 )
            return false ;
    
    else if(value[n-1]< sum ) 
    
        return t[n][sum] = isSubsetSum(value, sum - value[n-1], n-1) || isSubsetSum(value, sum, n-1);
    
    
    
    else 
        return t[n][sum] =  isSubsetSum(value, sum, n-1 );
    
    }
    
    static  boolean findEqualPartition(int value[], int n)
    {  
        int sum =0 ; 
        for(int i =0 ;i<n ;i++)
            sum = sum + value[i-1];
        
        if(sum%2 !=0)
            return false; 
        else return isSubsetSum(value, sum/2, n);
    
    }
    
    public static void main(String arg[]){
    
    
        int arr[] = { 3, 1, 5, 9, 12 };
        int n = arr.length;
       
        // Function call
        if (findEqualPartition(arr, n) == true)
            System.out.println("Can be divided into two "
                               + "subsets of equal sum");
        else
            System.out.println(
                "Can not be divided into "
                + "two subsets of equal sum");
    
    
    }
    
    }
    
    