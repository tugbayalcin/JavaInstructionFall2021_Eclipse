package day46_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		
		Deque<String> ciftBasli = new LinkedList<>();
		
		ciftBasli.add("Yildiz"); 
		ciftBasli.add("Ali");
		System.out.println(ciftBasli); 
		// Deque de iki tane add methodu vardir. addFirst ve addLast
		// ancak bir tane de hicbir sey yazmayan add vardir ki bu method aslinda parent olan Queue den gelmekte oldugu icin 
		// dogrudan en sona ekleyen bir methoddur
		ciftBasli.addLast("Emine");
		System.out.println(ciftBasli); // Deque den gelen method
		
		System.out.println(ciftBasli.pop()); // ilk elementi siler ve sildigini de dondurur, dondurulen eleman artik Deque'de yoktur
		System.out.println(ciftBasli); 
		
		ciftBasli.push("Seyfullah");
		System.out.println(ciftBasli);
		
		ciftBasli.add(null);
		System.out.println(ciftBasli);
		
		
		
		
		
	}

}
