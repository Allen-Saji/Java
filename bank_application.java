package LAB21;
import java.util.Scanner;

class Account{
	long acct_no;
	String name;
	String acct_type;
	long balance;
	
	Scanner sc = new Scanner(System.in);
	
	void withdraw() {
		System.out.println("Enter the amount to be withdrawn: ");
	    int amt = sc.nextInt();
	    
	    balance = balance - amt;
	}
	
	void deposit() {
		System.out.println("Enter the amount to be deposited: ");
		int amt = sc.nextInt();
		
		balance = balance + amt;
	}
	
	void Display() {
		System.out.println("Acount no: "+acct_no+"\nAccount Type: "+acct_type+"\nAccount holder name: "+name+
				"\nBalance: "+balance);
	}
	
	void Search() {
		
	}
	
}

public class bank_application {
	
	public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
	
	Account a1 = new Account();
	
	System.out.println("How many customers do you want to input?");
	int n = sc.nextInt();
	
	System.out.println("Customer Account Type: ");
	a1.acct_type = sc.next();
	
	System.out.println("Customer Account Number: ");
	a1.acct_no = sc.nextLong();
	
	System.out.println("Customer Name: ");
	a1.name = sc.next();
	
	System.out.println("Account Balance: ");
	a1.balance = sc.nextLong();
	int c;
	do {
	System.out.println("\n\n***Banking System Application***\n1.Display all account details"
			+ "\n2. Search by Account number\n"
			+ " 3. Deposit the amount \n"
			+ " 4. Withdraw the amount \n"
			+ " 5.Exit\n");
	
	 c = sc.nextInt();
	
	
	
	switch(c) {
	case 1: a1.Display();
	break;
	
	case 3: a1.deposit();
	break;
	
	case 4: a1.withdraw();
	break;
	
	case 5: System.out.println("*********************************\r\n"
			+ "    Thank You :) Visit again\r\n"
			+ "**********************************\r\n"
			+ "");
	c=5;
	
	}
	
	}while(c!=5);
	
	}

}
