package day46_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		
		Queue <String> kuyruk = new LinkedList<>();
		
		// sadece queue methodlarini kullanmak istedigimiz icin data turunu queue sectik
		
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Fatma");
		
		System.out.println(kuyruk);
		
		kuyruk.remove(); // kuyruk yapisinda oldugu icin hicbir sey belirtmedigimizde ilk eleman cikarilir
		
		kuyruk.add("Fatma"); // ayni elemandan 2 tane olabiliyor 
		
		kuyruk.add(null); // hash mekanizmasi ve unique olma ozelligi yok
						  // istedigimiz kadar null da ekleyebiliyoruz
		kuyruk.add(null);

	}

}
