package day48_Maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C04_Compute {

	public static void main(String[] args) {
		
		Map<String,Integer> ornek = new HashMap<>();
		
		ornek.put("A", 2);
		ornek.put("B", 5);
		ornek.put("C", 1);
		ornek.put("Z", 3);
		ornek.put("K", 10);
		
		System.out.println(ornek); // {A=2, B=5, C=1, Z=3, K=10}
		
		ornek.compute("A", (key,value) -> 10); // A key'inin degerini 10 ile degistirdi
		ornek.compute("A", (key,value) -> 2*value+5); 
		// functional programming denir
		// tum elemanlari ayni anda hepsini birden +5 arttirmak isteme sorularini bu yontemi for each icine koyarak cozebiliriz
		
		ornek.computeIfAbsent("D", v ->20); // eger boyle bir key yoksa olustur ve evrdigim value'yu ona ata
		ornek.computeIfAbsent("C", v ->11);
		ornek.computeIfAbsent("L", k ->12); // k yazsak bile value olarak ekledi
		
		ornek.computeIfPresent("L", (key,value) -> 2*value+5); // bu defa da varsa degistirecek
		System.out.println(ornek);
	}

}
