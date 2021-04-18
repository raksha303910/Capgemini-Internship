package lab5;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		System.out.println("Enter the age of person :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		try {
			if(age<15)
			{
				throw new InvalidInput("Exception");
			}
			else {

			System.out.println("Entered age is valid");

			}
		}
		catch(InvalidInput e)
		{
			System.out.println("Caught exception - Please enter age greater than 15");
		}
	}

}
