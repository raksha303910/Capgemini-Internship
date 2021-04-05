package s1;
import java.util.*;
public class StudentApp {
	Student s;
	
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		StudentApp o=new StudentApp();
		
		
		
		Student ab=new Student("raksha","F"," 78",1,1000.0,5, 6945);
		Student st=new Student("srivatsa","M","95",2,200.0,4, 5780);
		
		o.display(ab);
		o.display(st);
		
	}
	
	
	
	
	public void display(Student s)
	{
		System.out.println("Student Details:\n"+s.getStudentName()
		+"\nRoll no: "+s.getRollno()+"\nGender: "+s.getStudentGender()
		+"\nMarks Obtained: "+s.getObtainedmarks()+" out of "+
		(s.getnosub()*100));
		if(s.getUpdateFees()==s.getFees())
			System.out.println("\nStudent has passed. "
					+ "No changes in fees viz "+s.getFees());
		else
			System.out.println("Student has failed. Previous fees: "
					+s.getFees()+" Updated Fees: "+s.getUpdateFees());
		
		
		System.out.println(s.getP()+" "+s.getPercent()+"\n\n");
		
	}

}
