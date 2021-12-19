package day44_Iterator_Collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

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
		
		// index kullanmadan tum elemanlari 3 eklenmis olarak yazdirin
		// for each ile yapabiliriz
		
		for(Integer each : liste) 
		{
			System.out.print(each+3 + " ");
		}
		System.out.println();
		// ancak listeyi yeniden yazdirmak istedigimizde
		System.out.println(liste);
		// eski halinin yazildigini goruruz, cunku loop icerisinde yapilan degisiklikler local degisikliklerdi ve kalici olmazdi, cunku atama yok
		
		// atama yapmayi deneyelim
		for(Integer each : liste) 
		{
			each +=3;
			System.out.print(each + " ");
		}
		System.out.println();
		// listeyi yeniden yazdirmayi deneyelim
		System.out.println(liste);
		// eski haline dondu
		
		
		// foreach loop ile index kullanmadan tum elementlere ulasabiliyoruz  ancak kalici degisiklik yapamiyoruz
		//
		
		

	}

}
