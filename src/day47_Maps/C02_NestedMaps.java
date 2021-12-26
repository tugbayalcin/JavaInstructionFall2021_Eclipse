package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
		
		// ic ice yapi olustururken her zaman en icerden basla, daha kolay olur
		
		// ic ice map olusturacaksak en icerdekinden baslamaniz tavsiye olunur
		
		Map<String,String> ogr1Map = new HashMap<>();
		ogr1Map.put("isim", "Ali");
		ogr1Map.put("soyisim", "Can");
		ogr1Map.put("brans", "J.Dev");
		
		Map<String,String> ogr2Map = new HashMap<>();
		ogr2Map.put("isim", "Veli");
		ogr2Map.put("soyisim", "Yan");
		ogr2Map.put("brans", "QA");
		
		Map<String,String> ogr3Map = new HashMap<>();
		ogr3Map.put("isim", "Ali");
		ogr3Map.put("soyisim", "Yan");
		ogr3Map.put("brans", "C#");
		
		Map<String,String> ogr4Map = new HashMap<>();
		ogr4Map.put("isim", "Ayse");
		ogr4Map.put("soyisim", "Can");
		ogr4Map.put("brans", "QA");
		
		System.out.println("1. Ogrenci : " + ogr1Map);
		System.out.println("2. Ogrenci : " + ogr2Map);
		System.out.println("3. Ogrenci : " + ogr3Map);
		System.out.println("4. Ogrenci : " + ogr4Map);
		// yazdirma sirasina mudahale edemiyoruz malesef
		
		Map<Integer,Map<String,String>> sinifMap = new HashMap<>(); // icerideki map in <> ini yazmak zorunda degiliz ama sikinti cikabilir, yazsak iyi olur
		sinifMap.put(101, ogr1Map);
		sinifMap.put(102, ogr2Map);
		sinifMap.put(103, ogr3Map);
		sinifMap.put(104, ogr4Map);
		
		System.out.println(sinifMap);


	}

}
