package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		
		// 
		
		List <String> isimler = new ArrayList<>();
		
		isimler.add("Ali");
		
		System.out.println("Bir eleman: " + isimler); // [Ali]
		
		isimler.add("Veli");
		
		System.out.println("Iki eleman: " + isimler); // [Ali, Veli]
		
		// add() methodu listenin sonuna ekleme yapar
		
		isimler.add("Can"); // siralama yapmadan sona ekler 
		
		System.out.println("Uc eleman: " + isimler); // [Ali, Veli, Can]
		
		isimler.add(1,"Ayse");
		System.out.println("1. indexe Ayse ekledik: " + isimler); // [Ali, Ayse, Veli, Can]
		
		// isimler.add(5); // hata verir, muhakkak string eklemelisin der
		// declare ederken belirttigimiz data turu disinda bir data turunden ekleme yapamayiz
		
		List <String> liste2 = new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah"); // listlere elemanlari tek tek eklemek zorundayiz, toplu bir sekilde ekleyemeyiz
		
		System.out.println("liste2: " + liste2);
		
		// liste1'in sonuna liste2'yi ekleyebilir miyiz
		
		isimler.addAll(4,liste2); // parametre: nereye ekleyecegiz, neyi ekleyecegiz 
		System.out.println("liste2'yi ekledik: "+ isimler);
		
		isimler.addAll(liste2);
		System.out.println("index olmadan liste2'yi tekrar ekledik: "+ isimler); // sona ekledi
		
		

	}

}
