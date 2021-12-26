package day48_Maps_TheEnd;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {
		
		Map<Integer,String> ornek = MapOlustur.myMap();
		System.out.println(ornek);
		
		System.out.println(ornek.containsKey(110)); // false
		System.out.println(ornek.containsValue("Java")); // false,  cunku java benim value elemanimin tamami degil sadece bir parcasi, split yapmadigim icin bunu tek basina algilamaz
		System.out.println(ornek.containsValue("Mustafa, Kan, JAVA")); // true
		System.out.println(ornek.getOrDefault(110, "Girilen key map'de bulunmamaktadir")); // eger listede varsa getiriyor, yoksa benim yazdigim mesaji yazdiriyor
		System.out.println();
		System.out.println();
		
		Set<Entry<Integer,String>> entrySet = ornek.entrySet(); // her bir elemana entry denir 101= Ali, Can ,Java bir entry'dir
		
		int sayac = 1;
		for(Entry<Integer,String> each : entrySet) 
		{
			System.out.println(sayac + ".entry: "+ each);
			sayac++;
		}
		
		ornek.putIfAbsent(103, "Ali, Yan, C#"); // verilen elemani varsa eklemez, yoksa ekler
		ornek.putIfAbsent(110, "Fikri, Yan, QA");
		
		
		

	}

}
