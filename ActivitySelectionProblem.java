import java.util.*; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
public class ActivitySelectionProblem{    
  public static void main(String []args){             
        try
        {                          
      InputStreamReader r=new InputStreamReader(System.in);    
      BufferedReader br=new BufferedReader(r); 
      String[] s1 = br.readLine().trim().split(" "); 
      String[] s2 = br.readLine().trim().split(" "); 
      Map<Integer, Integer> treeMap = new TreeMap<Integer,Integer>(); 
      
      for(int i =0 ;i<s1.length;i++)
      {  
       treeMap.put(Integer.parseInt(s2[i]), Integer.parseInt(s1[i]));
      }

      int c =0 ;
      int p_f  = 0;
      for (Map.Entry<Integer,Integer> entry : treeMap.entrySet()) {
            int s = entry.getValue(); 
            int f = entry.getKey();
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
        catch(Exception e)
        {
                System.out.println(e);
        }
          
     }
}