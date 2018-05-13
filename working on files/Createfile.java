import java.io.File;
import java.util.*;
class Createfile  {
	public static void main(String[] args) {
		final Formatter x;
		try{
			x= new Formatter("fred.txt");
			System.out.println("new file created!");
		}
		catch(Exception e ){
			System.out.println("you got an error");
		}
	}
	
}