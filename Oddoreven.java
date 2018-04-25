import java.util.Scanner;
class Oddoreven
{

public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int num;
System.out.println("Enter the number you wish to analyze\n");
num=input.nextInt();
if((num%2)==0)
{
System.out.printf("%d is even\n",num);
}
else
System.out.printf("%d is odd\n", num);


}


}
