package day37_Inheritance;

public class Corolla extends Toyota{
	

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerlekSayisi =4;
	String uretimYeri = "Turkiye";

	public static void main(String[] args) {
		

					Corolla 		      arb1             =            new         Corolla();
		// class ismi && data type      obje ismi      assignment     keyword      constructor
		
		//Java'da obje olusturdugumuz her class ismi ayni zamanda bir data turudur
		// Bu ornegimiz icin Corolla hem class adi hem de olusturdugumuzz arb1 objesinin data type'idir 
		//Javada obje uretilen her bir class ayni zamanda non-primitive data taype olur
		String str = new String("Ali Can"); // yaptigimizda olan String gibi
		
		
		System.out.println(arb1.calisiyorMu);
		System.out.println(arb1.tekerlekSayisi);
		System.out.println(arb1.uretimYeri);
		
		Toyota arb2 = new Corolla();
		// data turum istersem corolla olabilir istersem de toyota olur cunku aralarinda parent-child iliskisi var
		
		
		System.out.println(arb2.calisiyorMu);
		System.out.println(arb2.tekerlekSayisi);
		System.out.println(arb2.uretimYeri);
		
		Araba arb3 = new Corolla();
		// hatta data turumu araba olarak bile alabilirim cunku supsuper classim
		// kalitim aldigim icin yapabiliyorum

		
		
		
		
	}

}
