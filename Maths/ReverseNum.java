import java.util.*;
class ReverseNum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		int r;
		int reverse=0;
		System.out.print("Enter the number to reverse");
		num=input.nextInt();
		int a=num;
		while(num>0){
			r=num%10;
			reverse=reverse*10+r;
		num=num/10;
		}
		System.out.printf("reverse number : %d", reverse);
	}
	
}
