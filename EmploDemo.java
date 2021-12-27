import java.util.*;
class Emplo{
    String name,dob,designation,empcode,salary;

    Scanner sc = new Scanner(System.in);

    void Getdata(){
        System.out.println("Enter the employee code: ");
        empcode = sc.nextLine();
        System.out.println("Enter the employee name: ");
        name = sc.nextLine();
        System.out.println("Enter the employee DOB: ");
        dob = sc.nextLine();
        System.out.println("Enter the employee designation: ");
        designation = sc.nextLine();
        System.out.println("Enter the employee salary: ");
        salary = sc.nextLine();
    }

    void Display(Emplo e1){
        System.out.println("Employee code: "+e1.empcode);
        System.out.println("Employee name: "+ e1.name);
        System.out.println("Employee dob: "+ e1.dob);
        System.out.println("Employee designation: "+e1.designation);
        System.out.println("Employee salary: "+e1.salary);
    }
}


public class EmploDemo {
    public static void main(String[] args) {
        Emplo e1 = new Emplo();
        e1.Getdata();
        e1.Display(e1);
    }
}
