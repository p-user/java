import java.io.*;
public class Filereader1  {
	public static void main(String[] args) {
		File x =new File("textfile.txt");
		if (x.exists()) {
			System.out.println(x.getName()+"yes!exists");
			
		}
		else
			System.out.println("sorry, no such file");

	}
	
}
