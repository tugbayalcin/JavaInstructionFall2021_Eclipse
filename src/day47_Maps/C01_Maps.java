package day47_Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		
		// 1
		// Bir map olusturmadan once, map'e koyacagimiz Key ve Value degerlerini inceleyebilmeliyiz
		// tum degerleri koyabilmek icin Key ve Value icin Object,Object secebiliriz
		// Ama  bu durumda map icerisindeki elemanlara ait bbilgilere ulasmakta zorlanabiliriz
		// Data turunu secerken hem icine koyacagimiz tum elemanlari kapsayacak bir data turu secmeliyiz 
		// hem de icine koydugumuz tum elemanlari isleyebilecek sekilde basit data turu secmeliyiz
		
		
		// 2
		// Map olustururken, turune de kara vermeliyiz
		
		Map<Integer,String> sinif = new HashMap<>(); 
		
		sinif.put(101, "Ali, Can, J.Dev");
		sinif.put(102, "Veli, Yan, QA");
		sinif.put(103, "Ali, Yan, C#");
		
		int no = 104;
		String isim = "Ayse";
		String soyisim = "Can";
		String brans = "QA";
		
		sinif.put(no, isim + ", " + soyisim + ", " + brans);
		
		System.out.println(sinif);
		
		sinif.get(102); // no'su 102 olan opgrencinin bilgileri --> Burada get methodunun icine Key yazilir, method bize Value'yu yazdirir
		System.out.println(sinif.get(102));
		
		
		// map'teki tum key'leri gorelim
		sinif.keySet();
		System.out.println(sinif.keySet());
		
		// map'teki tum value'lari gormek istiyorsam
		sinif.values();
		System.out.println(sinif.values());
		// ancak yazdirma islemi di,sinda baska bir sey yapamayiz
		
		// siniftaki ogrencilerin isimlerini bir listeye ekleyip yazdiralim
		List<String> valueList = new ArrayList<>(sinif.values()); // arrayList in en buyuk avantaji index yapisina sahip olmasi
		System.out.println("valueList: " + valueList);
		
		System.out.println(valueList.size()); // bana 4 yazdiracak, icinde 12 tane eleman var gibi gorunuyor
		// ancak her bir elemanin birden fazla verisi var. Her ver bir eleman demek degildir
		
		// şimdi her elemanimin yalnizca isimlerini almaya calisalim:
		
		List<String> isimListesi = new ArrayList<>();
		String[] bilgiler = new String[3]; // her bir elemani parcaladigimda kac parca olusacak, 3 parca. Her value'nun 3 adet bilgisi var
		
		for(int i=0; i<valueList.size(); i++) 
		{
			bilgiler = valueList.get(i).split(",");
			isimListesi.add(bilgiler[0]);
		}
		System.out.println(isimListesi);
		
		
		
		
	}

}
