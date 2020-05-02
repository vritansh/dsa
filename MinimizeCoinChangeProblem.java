public class MinimizeCoinChangeProblem {
static int findMaximum (int V)
{
    int[] arr = {1000,500,100,50,20,10,5,2,1};
    int     n = arr.length;
    for(int i =0 ; i<n;   i++)
            if(V>=arr[i])
            {
                   return arr[i];
              
            }
    return 1 ; 
   }    
public static void main(String[] args)
{ 
    int V = 121;
    int l ; 
    int count = 0 ;
    while(V!=0)
        {
          
            l = findMaximum(V);
            V = V- l ;
            count++;  
            
        }
        System.out.println(count);
}

}