package Day44_Iterator_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {

	public static void main(String[] args) {
		
		// iterator kullanarak tum elementleri silin
		
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
		
		// iterator'da while loop kullanilir
		
		while(ite1.hasNext()) // true dondugu surece, yani yaninda eleman oldugu surece bu loop donsun
		{
			ite1.next(); // hareket et
			ite1.remove(); // sil
		}
		
		System.out.println(liste); 
		

	}

}
