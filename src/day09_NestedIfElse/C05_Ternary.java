package day09_NestedIfElse;

public class C05_Ternary {

	public static void main(String[] args) {
		
		int x = 10;
		
		String sonuc = (x%2 == 0) ? "cift sayi" : "tek sayi"; // atama yapmadigimizda java hata veriyor !!!
		
		System.out.println(sonuc); // cift
		
		System.out.println((x%2 == 0) ? "cift sayi" : "tek sayi");
		
		// ternary iki turlu kullanilabilir
		// ya donen sonuca gore bir variable olusturup assign ederiz --> kalici olarak elimde tutarim
		// veya direct sout icine yazip sonucu yazdirabiliriz. --> tek kullanimlik olur, sonra kaybolur
		
		//  x>5 ? "Aferin" : 4;  --> Bu ifadeyi yukarida belirtilen iki secenekten yalnizca biri ile kullanabiliriz
		// cunku cikacak sonuclarin data typelari birbirinden farkli oldugu icin tek bir variablea atayamam
		// Bu yuzden yalnizca sout icine yazabilirim
		
		System.out.println(x>5 ? "Aferin" : 4);
		
		// eger ternary'de donecek sonuclar ayni data turunden degilse atama yapamayiz, sadece sout ile yazdirabiliriz
		
		
		// if statement icerisine (bodysine) kod yazmak zorunda degiliz, bos da birakabiliriz
		// ancak ternary ifadesi kod calistirmaz, deger dondurur Bundan dolayi bir variable'a atamak zorundayiz
		
		
		// EKRANDA NE GORURUZ
		
		// SORU 1
		int c = 112;
		System.out.println((c>5) ? ("inek") : ("koyun")); // inek 
		
		// SORU 2
		int t = 112;
		System.out.println((t<91) ? 9 : 11 ); // 11
		
		int y = 1;
		int z = 1;
		int a = y<10 ? y++ : z++;
		System.out.println(y + "," + z + "," + a);	 // 2,1,1	
		

	}

}
