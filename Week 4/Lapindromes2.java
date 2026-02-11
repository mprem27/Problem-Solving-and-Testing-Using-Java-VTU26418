import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();   
        
        while(T-- > 0)
        {
            String s = sc.next();
            int n = s.length();
            
            int[] firstHalf = new int[26];
            int[] secondHalf = new int[26];
            
            if(n % 2 == 0)
            {
                for(int i = 0; i < n/2; i++)
                {
                    firstHalf[s.charAt(i) - 'a']++;
                }
                
                for(int i = n/2; i < n; i++)
                {
                    secondHalf[s.charAt(i) - 'a']++;
                }
            }
            else 
            {
                for(int i = 0; i < n/2; i++)
                {
                    firstHalf[s.charAt(i) - 'a']++;
                }
                
                for(int i = n/2 + 1; i < n; i++)
                {
                    secondHalf[s.charAt(i) - 'a']++;
                }
            }
            
            boolean isLapindrome = true;
            
            for(int i = 0; i < 26; i++)
            {
                if(firstHalf[i] != secondHalf[i])
                {
                    isLapindrome = false;
                    break;
                }
            }
            
            if(isLapindrome)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
        sc.close();
    }
}
