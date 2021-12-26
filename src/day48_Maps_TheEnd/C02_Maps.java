package day48_Maps_TheEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		
		// Soru 3: Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
		// map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// Istenen dil  java
		// Sonuc  [Ali, Veli]
		
		// eger ben isyerimde surekli yukaridaki map i kullamiyorsam ayri bir classta static olarak bu map'i olusturayim 
		// ve ne zaman ihtiyacim olsa onu cagirip kullanayim
		
		Map<Integer,String> soruMap = MapOlustur.myMap(); // class adi ile statik map i cagirdik
		
		String istenenDil ="Java";
		
		dilBilenListesiOlustur(soruMap,istenenDil);
		System.out.println(dilBilenListesiOlustur(soruMap,istenenDil));

	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		
		List<String> dilBilenListesi = new ArrayList<>();
		
		soruMap.values(); // bize collection dondurur,colelctionla manipulation yapamadigimiz icin list'e donusturelim
		List<String> valueList = new ArrayList<>(soruMap.values());
		// System.out.println(valueList); // cok eleman gorundugune bakma aslinda eleman sayisi 3, mapten her bir elemanin farkli verileri geldigi icin cok gorunuyor
		// bu 3 elemani tek tek ele alip split ile bolup, dil degeri verilen input'a esit olanlarin isim degerlerini dilBilenListesi'ne ekleyecegiz
		
		String[] parcaliArr = new String[3];
		
		for(String each : valueList) 
		{
			parcaliArr = each.split(", "); // [Ali, Can, Java] seklinde 3 elemanli bir array getirecek
			if(parcaliArr[2].equalsIgnoreCase(istenenDil))
			{
				dilBilenListesi.add(parcaliArr[0]);
			}
		}
		
		return dilBilenListesi;
		
	}

}
