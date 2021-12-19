package Day44_Iterator_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

	public static void main(String[] args) {
		

		List <Integer> liste = new ArrayList<>();
		
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		
		System.out.println(liste); // [5,	 3,	 7,	 1,	 9,	 8,	 2]
		
		@SuppressWarnings("rawtypes")
		Iterator ite1 = liste.iterator();
		// iterator boyle olusturulur
		// java util den impoırt et, ilk satirda cikandan degil
		// burada iterator yalnizca bu liste icin olusturuldu
		// iterator ilk olusturuldugunda 0. indexin solunda yer alir
		// iterator da 3 method vardir, hasNext, next ve remove
		// hasnext methodu iterator un saginda eleman var mi yok mu boolean olarak dondurur
		// next methodu ise iterator i bir adim ilerletir ve kanit olarak da ustunden atladigi elemani yazdirir
		// biz iterator i nereye kadar tasirsak biraktigimiz yerde kalir, hicbir yere kimildayamaz 
		// listenin sonuna kadar bile gitsek, sonunda bekler 
		
		
		// nasil calistigini anlamak icin asagidaki kodun ciktisini inceleyelim
		for(int i=0; i<liste.size(); i++) 
		{
			System.out.println(ite1.hasNext() + " ==== " + ite1.next());
			// loop icerisinde i ile ilgili hicbir sey yok
			// yalnizca dongunun 7 kere donmesini saglayacak
			// 7 kere bir seyler yazdirilmasini saglayacak
		}
		System.out.println(ite1.hasNext()); // false 
		// yaninda eleman olmadigini bile bile iterator u bir yana kaydirmak istersek
		System.out.println(ite1.next()); // exception verir
		
		// foreach gibi calisiyor, index bagimsiz ancak sirali ilerler, karisik ilerlemez
		// ilerlemesini saglayan sey next methodudur
		

	}

}
