import java.util.*;
class randomNumberRange  {
	public static void main(String[] args) {
		
	
	Random rand=new Random();
	int i;
	//int input;
	int number;
	Scanner input=new Scanner(System.in);
	System.out.println("please enter a number");
	number=input.nextInt();
	for (i=0;i<5 ;i++ ) {
		System.out.println(rand.nextInt(number));
	}
	
}
}