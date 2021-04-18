package e1;
import java.util.Scanner;
public class StringReverse {
 public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter String to be reversed");
	 String s= sc.next();
	 getImage(s);
 }
 static void getImage(String s) {
	
	{
	 String str=s;
	 String rev= new StringBuffer(str).reverse().toString();
	 System.out.println(str+"||"+rev);
	}
}
}
