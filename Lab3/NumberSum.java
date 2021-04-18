package e1;
import java.util.*;


public class NumberSum {

	    public static void main(String args[]) {
	        int n;
	        int sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Numbers :");
	        String s = sc.nextLine();
	        StringTokenizer str = new StringTokenizer(s, " ");
	        while (str.hasMoreTokens()) {
	            String temp = str.nextToken();
	            n = Integer.parseInt(temp);
	            System.out.println(n);
	            sum = sum + n;
	        }
	        System.out.println("sum  is " + sum);
	    }

}
