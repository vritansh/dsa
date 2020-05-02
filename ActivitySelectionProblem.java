import java.util.*; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
public class ActivitySelectionProblem{    
  public static void main(final String []args){             
        try
        {                          
      final InputStreamReader r=new InputStreamReader(System.in);    
      final BufferedReader br=new BufferedReader(r); 
      final String[] s1 = br.readLine().trim().split(" "); 
      final String[] s2 = br.readLine().trim().split(" "); 
      final Map<Integer, Integer> treeMap = new TreeMap<Integer,Integer>(); 
      
      for(int i =0 ;i<s1.length;i++)
      {  
       treeMap.put(Integer.parseInt(s2[i]), Integer.parseInt(s1[i]));
      }

      int c =0 ;
      int p_f  = 0;
      for (final Map.Entry<Integer,Integer> entry : treeMap.entrySet()) {
            final int s = entry.getValue(); 
            final int f = entry.getKey();
        if(c ==0)
            {
                c++;
                p_f = f;
            }
        else 
            {
                if(s>p_f)
                {
                    c++;
                    p_f = f; 
                }
            }
    }

    System.out.println(c);
        }
        catch(final Exception e)
        {
                System.out.println(e);
        }
          
     }
}