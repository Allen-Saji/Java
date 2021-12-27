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

    void Display(){
        System.out.println("Employee code: "+empcode);
        System.out.println("Employee name: "+name);
        System.out.println("Employee dob: "+dob);
        System.out.println("Employee designation: "+designation);
        System.out.println("Employee salary: "+salary);
    }
}


public class EmploDemo {
    public static void main(String[] args) {
        Emplo e1 = new Emplo();
        e1.Getdata();
        e1.Display();
    }
}
