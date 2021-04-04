package A1;

import java.util.Scanner;

public class Pattern1 {
	
	 public static void main(String args[]) //driver function
	    { 
	    	int n ,space = 1;
	    	System.out.print("Enter the number of rows: ");
	    	Scanner s = new Scanner(System.in);
	    	n = s.nextInt();
	    	
	        for (int i=0; i<n; i++) 
	            { 
	                System.out.print(" "); 
	            
	            for (int j=0; j<=i; j++ ) //inner loop for number of columns
	            { 
	                System.out.print("* "); //print star
	            } 
	  
	            System.out.println(); //ending line after each row
	        } 
	    
	    }
	   
	}

