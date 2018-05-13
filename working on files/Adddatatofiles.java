import java.io.*;
import java.lang.*;
import java.util.*;
class Adddatatofiles {

	private Formatter x;
	

	public void openfile(){
		try{
			x=new Formatter("contacts.txt");
		}
		catch(Exception e){
			System.out.println("you got an error");
		}
	}

	public void addrecords(Person p){
		x.format("\n%s\n", "--------------------");
		x.format("%s\t%s\t %d" , p.firstname(), p.lastname(), p.aged());
		x.format("\n%s\n", "--------------------");
	}


	public void closefile(){
		x.close();
	}

	
}