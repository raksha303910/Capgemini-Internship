package lab5;
import java.util.Scanner;
public class Mainapp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  First name and Last name ");
		String first = sc.next();
		String last = sc.next();
		System.out.println("Fname"+ first + "\n");
		System.out.println("Lname"+ last  + "\n");
		try {
			if(first==null || last==null)
			{
				throw new Exception("Exception");
			}
			System.out.println("Fullname is= "+first+" "+last);
		}
		catch(Exception e)
		{
			System.out.println("Enter the name correctly");
		}
	}

}
