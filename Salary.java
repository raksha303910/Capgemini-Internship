package p1;

import java.util.Scanner;

public class SalaryBreakup {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter your Base/Basic Annual Salary");
	float x = sc.nextInt();
	
	float HRA = (float) (0.4 * a);
	float y = HRA+x;
	float DA = (float) (0.6 * b);
	
	if (x < 200000) {
		float tax = 0;
	}
	if (x > 200000 && x <= 600000) {
		float tax = (float) 0.1;
	}
	if (x > 600000) {
		float tax = (float) 0.2;
	}
	
	float tax = 0;
	float take_home_sal = (float) (x+HRA+DA+tax);
	System.out.println("Your take home Salary is ==>" + take_home_sal  );
	
	}
}

