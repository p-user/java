//usingthe collection interface

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectiontest{
	private static final String[] colors = {"MAGENTA", "RED", "WHITE","BLUE","CYAN"};
	private static final String[] removecolors={"RED", "WHITE","BLUE"};

	//lets create ArrayList, add colors and manipulate

	public collectiontest(){
		List <String> list = new ArrayList <String>();
		List <String> removelist = new ArrayList <String>();
	for(String color : colors)
		list.add(color);
	for(String color :removecolors)
		removelist.add(color);
	System.out.println("ArrayList: ");
	for(int i=0;i<list.size();i++)
		System.out.printf("%s", list.get(i));

	removecolors(list,removelist);
	System.out.println("\n\n ArrayList after calling removecolors: ");
	for (String color : list)
		System.out.printf("%s", color);
	private void removecolors(
		Collection <String> collection1, Collection <String> collection2)
	{
	
		Iterator <String>iterator=collection1.iterator();
		while( iterator.hasNext())
			if( collection2.contains(iterator.next()))
				iterator.remove();
	}
	public static void main(String[] args) {
		new collectiontest();
	}
	
}    