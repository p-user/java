import java.util.*;
import java.io.*;
class Readfile  {
	private Scanner x;
	public void fileopen(){
		try{
			x = new Scanner(new File("contacts.txt"));
		}
		catch(Exception e){
			System.out.println("File not found");
		}

	}
	public void fileread(){
		while (x.hasNext()) {
			String a=x.next();
			String b=x.next();
			String c=x.next();
			System.out.printf("%s %s %s", a, b,c);
			
		}
	}
	public void closefile(){
		x.close();
	}
}