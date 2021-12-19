package day33_StringBuilder;


public class C03_Equals {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb1==sb2); // false
		System.out.println(sb1.equals(sb2)); // false 
		// burada equals methodu stringden farkli olarak icerige bakmaz
		
		// System.out.println(sb1.compareTo(sb2)); // 0    ??? HATA VERDİ, IDE'DEN KAYNAKLI DAHA SONRA INCELE
		// Ilk harflerden baslayarak birebir StringBuilder'lari karsilastirir
		// Eger tum karakterler ayni ise sonuc olarak 0 doner
		// Farkli karakterler bulursa sb1; sb2'den ne kadar onde ise onu yazdirir
		// mesela sb1 =jeva, sb2=java olsa idi e harfi a harfinden 4 karakter onde oldugu icin 4 verirdi
		// geride oldugunda - degerler dondurur
		// yalnizca ilk farkli karaktere bakar ve sonucu yzar, diger farklilara bakmaz
		
		
		// sb'da equals methodu String'deki mantikla calismaz, == mantigiyla calisir
		
		// ! StringBuilder == veya equals ile karsilastirilamaz
		// yalnizca compareTo methoduyla karsilastirilirlar
		
		
		// eger iki sb'in esit olup olmadigini anlamak istersek sb1.compareTo(sb2)==0 ile bakabiliriz
		
		
		String str = "Java";
		// System.out.println(sb1==str);  --> Itiraz var cunku biri string biri stringBuilder, elma ile armut
		System.out.println(sb1.equals(str)); // itiraz yok ancak false donduruyor
		// System.out.println(sb1.compareTo(str)); // compare methodu string icin kullanilamaz
		
		// System.out.println(sb1=="Java"); // Itiraz var --> sb != string
		// direk " " icerisine yazdigin ifade string olarak algilanir
		
		System.out.println(sb1.equals("Java")); // Itiraz Yok --> false :(
		// System.out.println(sb1.compareTo("Java")); // Itiraz var 
		
		
		
		
		

	}

}
