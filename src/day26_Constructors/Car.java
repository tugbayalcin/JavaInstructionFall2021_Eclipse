package day26_Constructors;

public class Car {
	
	// java; biz bir class olusturdugumuzda, o classtan obje uretecegimizi bilir ve her class'a default bir constructor yerlestirir
	// Java'nin class'a koydugu bu default constructor gorulmez ama obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer 
	
	
	// Bir constructor olusturmak cok kolaydir
	// method olusturmaya benzer ancak methoddan farklidir
	// 1. Constructor ismi class ismi ile ayni olmalidir 
	// class isimleri buyuk harfle basladigi icin, construcror ismi de buyuk harfle baslar (methoddan birinci farki budur. methodlar kucuk harfle baslar)
	// 2. constructorlarin return type'i olmaz (methoddan ikinci farki budur, methodlarin mutlaka return type'i olmalidir)
	
	public Car() 
	{
		
	}
	// javanin her classta olusturdugu constructor budur
	
	
	public int yil=2000;
	public String renk;
	String model;
	int km=0;
	boolean satilikMi;
	
	// bugun itibari ile classlarda main method olma mecburiyeti kaldirilmistir :)
	// ancak bildigimiz gibi main method olmayan bir class direkt calistirilamaz 
	// main methodu olmayan classlar baska classlardan obje olusturularak kullanilmak uzere 
	// ihtiyac duyulan variable ve method'lari sakladigimiz bir depo gibidir

}
