package A1;

public class Pattern7 {
	 

	    static void display(int n) 

	    { 

	        int i, j, k; 

	        for (i = 1; i <= n; i++) { 

	            for (j = 1, k = i; j <= i; j++,k++)
	            { 

	                if (k % 2 == 0) { 

	                    // to display the numbers 

	                    System.out.print(j); 
	       

	                } 

	                else { 

	                    //to display the stars 

	                    System.out.print(" ");

	                } 

	            } 

	            System.out.print("\n");

	        } 

	    } 

	    // Driver Code 

	    public static void main(String[] args) 

	    { 

	       
	        int n = 15; 

	        // to print the pattern 

	        display(n); 

	    } 

}

