package day01_02_Variables;

public class C02_Variables {

	public static void main(String[] args) {
		
		String okul = "Yildiz Koleji";
		// ayni isim ile 2. defa variable turu olusturulamaz
		// String okul = "Gunes Koleji";
		
		// farkli veri turu bile olsa ayni isim ile ikinci defa variable olusturulamaz 
		// int okul = 20;
		// cunku javaya okul degiskenini cagir dedigimde hangisini getirecegini bilemez, kafasi karisir
		System.out.println(okul);
		
		// onceden tanbimlanmis olan bir variable'a yeni deger atayabiliriz
		okul = "Ay Koleji";
		System.out.println(okul); // Ay Koleji yazar
		
		// yazdirma isleminde aciklama eklemek istersek 
		// mesela okul adi: Ay Koleji yazdirmak istiyorum
		System.out.println("Okul Adi: " + okul); // Okul Adi:Ay Koleji yazar
		// aciklama yazdirmak istedigimde; variable'a bagli kisimlar ile bagli olamayan kisimlari ayiriyoruz
		System.out.println("Okul Adi: " + "okul");  // Okul Adi: okul yazar. 
		// cunku cift tirnak icinde yazdigim sey artik degisken degildir stringtir
		
		


	}

}
