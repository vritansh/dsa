public class palindrome
{  

   static boolean isPalindrome(String s)
   {
         int start = 0 ;
         int end = s.length() -1;
         System.out.println(end);         
         while(start<end)
         {
               if(s.charAt(start)!=s.charAt(end))
                  return false ;
               
               start++;
               end--;

         }
         return true ;
   }


   public static void main(String [] args) {
    String test  = "kamalvrrvlamak";

    System.out.println(isPalindrome(test));
      
   }
}
