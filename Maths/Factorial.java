import java.util.*;
class Factorial {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a number");
	int number=input.nextInt();
	int factorial=1;
	int i;
	for (i=number;i>0 ;i--) {
		factorial=factorial*i;
		
	}
	System.out.println(factorial);
}
	
}
