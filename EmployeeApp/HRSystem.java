package j1;

public class HRSystem {
Employee e;
	
	public static void main(String[] args) {
		HRSystem o=new HRSystem();
		
		Employee e1=new Employee(90,"Name1","Ijk",1);
		Employee e2=new Employee(110,"Name2","c15",15);
		Employee e3=new Employee(98,"Name3","abc",11);
		Employee e4=new Employee(67,"Name5","a12",12);
		Employee e5=new Employee(67,"Name6","xyz",6);
		o.disp(e1);
		o.disp(e2);
		o.disp(e3);
		o.disp(e4);
		o.disp(e5);
		
	}
	public void disp(Employee e)
	{
		System.out.println("Employee Name: "+e.getEmpName()+" Employee ID: "+e.getEmpId());
		e.workingOnProject();
		System.out.println("Salary is "+e.getSalary()+" for "+e.getExp()+" years of experience.");
	}

}
