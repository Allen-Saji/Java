 import java.util.*;

class Emp01{
	double basic_salary,DA,HRA;
	
	void display() {
		System.out.println("Name of the class is Emp01");
	}
	
	void calcSalary(double basic_salary,double DA, double HRA ) {
		double Tsalary = (basic_salary + (basic_salary*DA) + (basic_salary*HRA));
		System.out.println("Salary of the employee is: " + Tsalary);
	}
	
}

class Engineer extends Emp01{
	
	void display() {
		super.display();
		super.calcSalary(basic_salary, DA, HRA);
		System.out.println("Name of the class is Engineer");
	}
	void calcSalary(double basic_salary,double DA, double HRA ) {
		
		double Tsalary = (basic_salary + (basic_salary*DA) + (basic_salary*HRA));
		System.out.println("Salary of the engineer is: " + (2*Tsalary));
	}
	
}


public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Engineer eng = new Engineer();
		
		System.out.println("Enter the basic salary: ");
		eng.basic_salary = in.nextDouble();
		System.out.println("Enter the Dearly allowance in decimal: ");
		eng.DA = in.nextDouble();
		System.out.println("Enter the HRA in decimal: ");
		eng.HRA = in.nextDouble();
		
		
		eng.display();
		eng.calcSalary(eng.basic_salary, eng.DA, eng.HRA);
		
	}

}
