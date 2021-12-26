package day45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		// LinkedList class oldugu icin ondan obje olusturabiliriz
		// List ve Deque interface'lerini implement etmistir
		
		System.out.println(ll); // bos bir liste yazdirir
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll); // [5, 7]
		// LinkedList'in iki tane interface parent'i vardir
		// Bunlardan birisi List oteki de Deque == > Queue (dolayisiyla sira var)
		
		ll.add(0,10); // List interface'den gelen ozellik ile 0. indexe eleman ekleme
		System.out.println(ll); // [10, 5, 7]
		
		ll.addFirst(3); // queue interface'inden gelen ozellik ile 0. indekse eleman ekleme
		System.out.println(ll); // [3, 10, 5, 7]
		
		// hangisini kullandigimiz onemli degil, canimiz isterse birini istemezse digerini kullanabiliriz
		
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.addAll(ll); // eski listemizi oldugu gibi ekledik
		System.out.println(ll2); // [3, 10, 5, 7]
		
		ll2.addAll(2,ll); // 2. indexten sonra ll i ekle demek
		System.out.println(ll2); // [3, 10, 3, 10, 5, 7, 5, 7]
		
		
		
	}

}
