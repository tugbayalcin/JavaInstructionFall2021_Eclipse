package day44_Iterator_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

	public static void main(String[] args) {
		

		List <Integer> liste = new ArrayList<>();
		
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		
		System.out.println(liste); 
		
		Iterator ite1 = liste.iterator();
		
		ite1.next();
		ite1.next();
		ite1.next();
		
		System.out.println(ite1.next()); // next sout icinde bile olsa imlec artik hareket etti ve gittigi yerde bekliyor 
		
		ite1.remove(); // remove methodu void bir methoddur, sout icerisinde bize bir sey yazdiramaz
		// System.out.println(ite1.remove()); 
		
		System.out.println(liste); // iterator en son ustunden atladigi elemani sildi, yani sol tarafindaki elemani sildi
		
		// simdi next demeden bir kere daha silmeyi deneyelim
		ite1.remove();  // exception verdi, elinde olani silmisti o yuzden elinde bir sey kalmadi
		

	}

}
