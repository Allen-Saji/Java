package LAB21;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		char in;
		System.out.println("Program to peroform division");
		do {
			System.out.println("Enter num1: ");
			num1 = sc.nextInt();
			
			System.out.println("Enter num2: ");
			num2 = sc.nextInt();
			try {
				int Result = num1/num2;
				System.out.println("Result = "+Result);
			}catch(ArithmeticException e) {
				System.out.println("/ by zero");
			}finally {
				System.out.println("End of Operation");
				System.out.println("Do you want to continue?");
				in = sc.next().charAt(0);
			}
		}while(in == 'y' || in == 'Y');

	}

}
