
import java.util.*;
import java.io.*;
public class Person  {
	
private String first_name;
private String last_name;
private int age;

	public Person(String first_name, String last_name, int age){
		this.age=age;
		this.first_name=first_name;
		this.last_name=last_name;
	}
	public String firstname(){
		return first_name;
	}
	public String lastname(){
		return last_name;
	}
	public int aged(){
		return age;
	}
}