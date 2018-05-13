//time1 object used in an app

public class Time1test{
	public static void main(String[] args) {
		time1 time= new time1();
		System.out.print(" The initial universal time is :  ");
		System.out.println(time.toUniversalString());
		System.out.print(" The initial standart time is :  ");
		System.out.println(time.toString());
		System.out.println();//empty row printed

		//change time and output the updated time 
		time.setTime(13,27,6);
		System.out.print(" The universal time after settime is :  ");
		System.out.println(time.toUniversalString());
		System.out.print(" The  standart time after setTime is :  ");
		System.out.println(time.toString());
		System.out.println();//empty row printed
		  //attempt to set  invalid input

		try
		{
			time.setTime(99,99,89);
		}
		catch(IllegalArgumentException e) {
			System.out.printf("Exception :  %s\n\n", e.getMessage() );

		}
		

	}
}
