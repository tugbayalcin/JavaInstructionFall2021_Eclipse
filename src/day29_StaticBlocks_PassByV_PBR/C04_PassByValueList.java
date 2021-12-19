package day29_StaticBlocks_PassByV_PBR;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		
		// Bir list olusturalim (array de olur farketmez)
		// ardindan list elemanlarini degistir methodu yazip burada listin bazi elemanlarinda degisiklikler yapalim
		// method void olsun
		// main method'a dondukten sonra yeniden list'i yazdiralim
		
		List <String> harfler = new ArrayList <>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		
		
		listElemanlarDegistir(harfler); // [T, B, C]
		System.out.println("Main memthod'a donunce list: " + harfler); // [T, B, C]
		
		// java'da list ve array gibi objeler icin de pass by value gecerlidir 
		// yani farkli bir methodda array veya list'e yeni deger atamasi yaparsaniz 
		// orjinal array veya list degismez 
		// 
		
		listDegistir(harfler); // methodda yeni deger atadigim halde harfler listesi degismedi
		System.out.println("List'e yeni list atadiktan sonra Main method'a donunce list: " + harfler); // [T, B, C]
		
		
		

	}

	private static void listDegistir(List<String> harfler) {
		
		harfler = new ArrayList<>();
		System.out.println("List'e yeni deger atayinca: " + harfler); // bos list yazdirdi
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0,"T");
		System.out.println("Method'da degistirdigimiz list: " + harfler);
		
	}

}
