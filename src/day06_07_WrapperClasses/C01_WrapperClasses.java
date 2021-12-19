package day06_07_WrapperClasses;

public class C01_WrapperClasses {

	public static void main(String[] args) {
		
		int sayi1 = 10;
		Integer sayi2 = 20;
		
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		// sayi1. dedigimde hicbir sey(method) cikmaz
		// cunku sayi1 primitive olarak tanimlanmis 
		
		// sayi2. dedigimde bircok method ciktigini gorebiliriz
		// bunun sebebi sayi2 non-primitive olarak tanimlandi ve non primitiveler degerleri ve methodlari tutabilirlerdi
		
		String tel1 = "3578987";
		String tel2 = "3245434";
		
		System.out.println(tel1+tel2); // 35789873245434 yazar 
		
		// Burada string yazdirma kurallari gecerli oldu ve bekledigimiz sekilde sonuc yazildi
		// Ama bazen string olarak girilen rakamlar ile matematiksel islemler yapmak isteriz
		// onlari sayisal deger olarak kabul etmek isteriz
		// Bu durumlarda string ifadeyi integer a cevirmem gerekiyor ama casting kurallarinda boyle bir sey yoktu
		// Iste bu noktada wrapper classlardan faydalanir ve uygun methodlari cagirarak islemlerimizi yaptirabiliriz
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		
		// Integer.valueOf(string) methodu : Rakamlar ile olusturulmus string ifadeyi integer a donusturur
		
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Integer.MAX_VALUE); // 2147483647
		
		// bu methodlar sayesinde ben bu degerleri ezberlemek zorunda kalmiyorum
		// istedigim zaman methodlari cagirarak bu degerleri kullanabiliyorum
		
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308 yazdi E den sonraki kisim 308 tane 0 var demek
		System.out.println(Short.MAX_VALUE); // 32767
		
		// String caddeNo = "B203"; // hem harf hem rakam var bakalim valueOf ne yapacak
		String sokakNo = "1564";
		String caddeNo2 = "203";
		
		System.out.println(Integer.valueOf(caddeNo2)+Integer.valueOf(sokakNo));
		// System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo)); // hata verdi
		// number format exeption dedi
		// senin yazdigin seyde bir problem var bu yazdigin sey sayi olamaz diyor
		// Integer.valueOf(String numeric value) methodu string olarak kaydedilmis numeric ifadeleri sayiya cevirir
		// ancak string ifadede numeric olmayan bir karakter olursa java NumericFormatExeption hatasi verir ve calismayi durdurur
		// stops execution
		// bu satirdan sonra yazilan kodlar dogru olsa bile calistirilmaz
		
		System.out.println("Hello world"); // dogru toplama isleminden sonra artik bu satirdaki kod da calisti
		

	}

}
