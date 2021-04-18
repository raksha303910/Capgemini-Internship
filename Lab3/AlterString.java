package e1;
import java.util.Scanner;
public class AlterString {
	
	
		 static boolean Vowel(char c)
		    {
		        if (c != 'a' && c != 'e' && c != 'i'
		                && c != 'o' && c != 'u') 
		        {
		            return false;
		        }
		        return true;
		    }
		  
		    static String replaceConsonant(char[] s) 
		    {
		        for (int i = 0; i < s.length; i++)
		        {
		            if (!Vowel(s[i]))
		            {
		  
		                if (s[i] == 'z') 
		                {
		                    s[i] = 'b';
		                }
		                  
		        
		                else
		                {
		  
		                    s[i] = (char) (s[i] + 1);
		  
		                  
		                    if (Vowel(s[i])) 
		                    {
		                        s[i] = (char) (s[i] + 1);
		                    }
		                }
		            }
		        }
		        return String.valueOf(s);
		    }
		
		    public static void main(String[] args)
		    {
		    	 Scanner sc =new Scanner(System.in);
		    	 System.out.println("Enter String");
		    	 String s= sc.next();
		        System.out.println(replaceConsonant(s.toCharArray()));
		    }
}
