
import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

class Account{
    long acct_no;
    String name;
    String acct_type;
    long balance;

    Scanner sc = new Scanner(System.in);

    void withdraw(Account arr[],int n) {
        System.out.println("Enter the Account no: ");
        long act = sc.nextLong();
        int flag = 0;
        for (int i=0;i<n;i++){
            if(arr[i].acct_no == act) {
                flag = 1;
                System.out.println("Enter the amount to be withdrawn: ");
                int amt = sc.nextInt();
                try {
                    if (amt <= 0) {
                        throw new ArithmeticException("InvalidAmountException");
                    }
                    if (amt > arr[i].balance) {
                        throw new InsufficientResourcesException("InsufficientFundsException");
                    }
                    arr[i].balance -= amt;
                }catch(ArithmeticException e){
                    System.out.println("No amount withdrawn");
                }catch (InsufficientResourcesException e){
                    System.out.println("Insufficient Balance");
                }
            }
        }
        if(flag!=1){
            System.out.println("Incorrect Account number!");
        }
    }

    void deposit(Account arr[],int n) {
        System.out.println("Enter the Account no: ");
        long act = sc.nextLong();
        int flag = 0;
        for (int i=0;i<n;i++) {
            if (arr[i].acct_no == act) {
                flag = 1;
                try {
                    System.out.println("Enter the amount to be deposited: ");
                    int amt = sc.nextInt();

                    if (amt <= 0) {
                        throw new ArithmeticException("InvalidAmountException");
                    }
                    arr[i].balance += amt;

                }catch (ArithmeticException e){
                    System.out.println("No amount deposited");
                }
            }
            if (flag != 1) {
                System.out.println("Incorrect Account number!");
            }
        }

    }

    void Display() {
        System.out.println("Account no: "+acct_no+"\nAccount Type: "+acct_type+"\nAccount holder name: "+name+
                "\nBalance: "+balance);
    }

    void Search(Account arr[],int n) {
        System.out.println("Enter the Account no: ");
        long act = sc.nextLong();
        int flag = 0;
        for (int i=0;i<n;i++){
            if(arr[i].acct_no == act){
                arr[i].Display();
                flag = 1;
            }
        }
        if(flag!=1){
            System.out.println("Incorrect Account number!");
        }
    }

}

public class bank_application {

    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

//        Account a1 = new Account();

        System.out.println("How many customers do you want to input?");
        int n = sc.nextInt();

        Account[] customers = new Account[n];

        for(int i=0;i<n;i++){
            customers[i] = new Account();
            System.out.println("Customer Account Type: ");
            customers[i].acct_type = sc.next();

            System.out.println("Customer Account Number: ");
            customers[i].acct_no = sc.nextLong();

            System.out.println("Customer Name: ");
            customers[i].name = sc.next();

            System.out.println("Account Balance: ");
            customers[i].balance = sc.nextLong();
        }


        int c;
        do {
            System.out.println("\n\n***Banking System Application***\n1.Display all account details"
                    + "\n2. Search by Account number\n"
                    + " 3. Deposit the amount \n"
                    + " 4. Withdraw the amount \n"
                    + " 5.Exit\n");

            c = sc.nextInt();



            switch(c) {
                case 1:
                    for(int i=0;i<n;i++) {
                        customers[i].Display();
                    }
                    break;

                case 2:
                    customers[1].Search(customers,n);
                    break;

                case 3:
                    customers[1].deposit(customers,n);
                    break;

                case 4:
                    customers[1].withdraw(customers,n);
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

