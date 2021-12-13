package LAB21;

class Person {
	String name,gender;
	int age;
	
Person(String n,String g, int a ){
	name = n;
	gender = g;
	age = a;
}	

void show() {
	System.out.println("Name: "+name + "\n Age: "+age+ "\n Gender: "+gender);
}
	
}

class Employee extends Person{
	String company;
	
	Employee(String n,String g, int a ,String c){
		super(n , g ,a);
		company = c;
	}
	
	void cshow() {
		System.out.println("Company: "+company);
	}
}

class Programmer extends Employee{
	int salary;
	Programmer(String n,String g, int a , String c, int s){
		super(n,g,a,c);
		salary = s;
	}
	
	void sshow() {
		System.out.println("Salary: "+salary);
	}
}


public class ProgrammerDemo {
	public static void main() {
		Programmer pp = new Programmer("Ammus" , "Female" , 22 ,"Intuit" , 112000 );
		
		pp.show();
		pp.cshow();
		pp.sshow();
	}
	
}
