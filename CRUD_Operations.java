package jdbc;
import java.sql.*;
import java.util.Scanner;

public class CRUD_Operations {
	static Connection conn;
	static Statement stmt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc = new Scanner(System.in);
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root",""); 
			 stmt = conn.createStatement();
			int n=0;
			while(n!=5) {
				System.out.println("1.Create\n2.Insert\n3.Update\n4.Delete\n5.Exit");
				n = sc.nextInt();
				switch(n) {
				
				case 1: {
					//conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root",""); 
					System.out.println("Trying to Create Table..");
					
					String sql = "create table employee "+
								"(empid integer not null, "+
								 "empName varchar(50), "+
								 " department varchar(50), "+
								 
								 " age integer, "+
								 " primary key (empid))";
					stmt.executeUpdate(sql);
					System.out.println("Table Created!");
					break;
				}
				
				case 2:{
					System.out.println("\nAdd data to Table");
					
					
					System.out.println("Enter the Employee number");
					int empid =sc.nextInt();
					System.out.println("Enter the employee name: ");
					
					String empname = sc.next();
					System.out.println("Enter the employee's department: ");
				    String dept = sc.next();
					System.out.println("Enter The employee age: ");
					int age = sc.nextInt();
					
					
					String strSql = "INSERT INTO employee(empid,empName,department,age) VALUES ("+empid+",'"+empname+"','"+dept+"',"+age+")";
					System.out.println(strSql);
//					INSERT INTO `employee` (`empid`, `empName`, `department`, `age`) VALUES ('032', 'Anitta', 'cs', '19');
					stmt.executeUpdate(strSql);
					System.out.println("\nThe entered data has been inseted into the table\n");
					break;
				}
				case 3: {
					System.out.println("Enter the empid you want to update: ");
					int empid  = sc.nextInt();
					System.out.println("Enter the new Emp Name: ");
					String name = sc.nextLine();
					String strql = "update employee set empname = '"+name+"' where empid ="+empid+"";
					stmt.executeUpdate(strql);
					System.out.println("\nThe above data is updated.\n");
					break;
				}
				
			}
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
