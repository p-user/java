import java.util.*;
import java.io.*;
import java.lang.*;
 class Filesandrecords  {
 	public static void main(String[] args) {
 		Adddatatofiles file=new Adddatatofiles();

 		Person p=new Person("Pamela ", "Agaj", 21);
 		Person r=new Person("Rejan","Topcija", 2);
 		Person e=new Person("Elma", "Canga", 13);
 		file.openfile();
 		file.addrecords(p);
 		file.addrecords(r);
 		file.addrecords(e);
 		file.closefile();
 	}
 }