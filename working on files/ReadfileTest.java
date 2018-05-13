import java.io.*;
import java.util.*;
class ReadfileTest  {
	public static void main(String[] args) {
		Readfile file=new Readfile();
		file.fileopen();
		file.fileread();
		file.closefile();
	}
	
}