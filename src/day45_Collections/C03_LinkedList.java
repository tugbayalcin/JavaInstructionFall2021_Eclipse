package day45_Collections;

import java.util.LinkedList;

public class C03_LinkedList {

public static void main(String[] args) {
		
	LinkedList<Integer> ll = new LinkedList<>();
		
	System.out.println(ll); // bos bir liste yazdirir
		
	ll.add(5);
	ll.add(7);
		
	System.out.println(ll); // [5, 7]
	
	
	
	ll.peek(); // ilk bana elemani getirecek ama gormek icin yazdirmamiz gerek
	System.out.println(ll.peek()); // SILMEDEN ilk elemani bana getirir
	
	ll.peekFirst(); // bu da ilk elemani getirir, peki aralarindaki fark ne: 
	System.out.println(ll.peekFirst()); 
	// su anda dolu listede her ikisi de ayni seyi yazdirdi
	LinkedList<Integer> ll2 = new LinkedList<>();
	
	System.out.println(ll2.peekFirst()); // bos listede null yazdirdi --> bu deq den geliyor galiba, iki tane bas oldugu icin first diye belirtiyoruz
	System.out.println(ll2.peek()); // bos listede null yazdirdi   --> bu queue den geliyor galiba, tek bas oldugu icin first diye belirtmeye gerek yok
	// hala fark yok 
	
	
	ll.element(); // 1. elemani getirir eleman yoksa, no such element exception firlatir
	System.out.println(ll.element()); // 5 yazdi 
	// System.out.println(ll2.element()); // exception verdi
	
	
	//ll.poll(); // 1. elementi hem yazdirir hem de siler, elemman yoksa null doner
	System.out.println(ll.poll()); // 5 yazdi 
	System.out.println(ll); // 7 yazdi
	System.out.println(ll2.poll()); // null dondu
	
	ll.hashCode(); // java'nin listemiz icin verdigi hash code'u verir
	System.out.println(ll.hashCode());
	
	ll2.hashCode();
	System.out.println(ll2.hashCode());

	System.out.println(ll2.offer(10)); // verdigim elemani hem ekliyor hem de ekledim diye true donuyor 
	}

}
