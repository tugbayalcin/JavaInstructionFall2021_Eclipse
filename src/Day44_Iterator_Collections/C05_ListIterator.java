package Day44_Iterator_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

	public static void main(String[] args) {
		
		List<String> liste = new ArrayList<>();
		
		liste.add("Ali");
		liste.add("Veli");
		liste.add("Ayse");
		liste.add("Fatma");
		liste.add("Emrah");
		
		System.out.println(liste);
		
		ListIterator li1 =liste.listIterator();
		
		// Iterator ve ListIterator birer interface dir ve onlardan obje olusturulamaz, iterator olustururken new keywordu kullanamayiz

		while(li1.hasNext()) 
		{
			li1.set(li1.next() + "x"); // biri set edecek biri getirecek
		}
		System.out.println(liste);
		
		// ikinci yol
		
		String temp = "";
		while(li1.hasNext()) 
		{
			temp = (String) li1.next();
			li1.set(temp + "x");
		}
		System.out.println(liste);
		
		
		
	}

}
