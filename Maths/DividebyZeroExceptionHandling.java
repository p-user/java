import java.util.InputMismatchException;
import java.util.Scanner;

public class DividebyZeroExceptionHandling  {
	public static int quotient(int numerator, int denominator )
		throws ArithmeticException{
			return numerator/denominator;
		}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean continueLoop=true;
		do{
			try{
				System.out.print("please enter the numerator ...");
				int numerator= scanner.nextInt();
				System.out.print("Enter the denominator...");
				int denominator=scanner.nextInt();
				int result=quotient(numerator, denominator);
				System.out.printf(" And the result of %d/%d is : %d ", numerator, denominator, result);
				continueLoop=false;
			}
			catch(InputMismatchException ex){
				System.err.printf("\nException :%s\n ", ex);
				scanner.nextLine();
				System.out.println("you must enter only integers");
				}
			catch(ArithmeticException ax){
				System.err.printf("Exception : %s\n", ax);
				System.out.println("Zero is invalid value . try again");

			}
		}while(continueLoop);
	}
	
}
