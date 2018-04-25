import java.util.Scanner;
public class primenumber {
	public static void main(String[] args) {
		
	System.out.println("enter a number");
	Scanner input=new Scanner(System.in);
	int number=input.nextInt();
	int i;
	int counter=0;
	for (i=2;i<number;i++ ) {
		if(number%i==0){
			
			counter++;
		}
	
}
if (counter==0){
System.out.println("the number is prime");
}
else
{
	System.out.println("number is not prime");
}
}
}