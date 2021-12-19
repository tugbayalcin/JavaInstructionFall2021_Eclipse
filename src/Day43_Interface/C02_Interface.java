package Day43_Interface;

public interface C02_Interface {
	
	// interface'lerde methodlar public ve static olmak zorundadirlar
	// biz basina yazsak da yazmasak da java onu otomatik olarak tamamlar ve oyle kabul eder
	
	void motor(); // 1.method
	// normal class'larda buradaki access modifier default olarak kabul edilirken
	// interface'lerde  buradaki access modifier public olarak kabul edilirken
	
	int sayi =10; // kendi otomatik italik ve mavi yapti yani kendisi otomatik final ve static olarak kabul etti
	
	// java 8 sonrasinda interface'lerde body'si olan method yazilabilir
	
	// interface de karsilasacagin default ve static bildigin default ve static degildir
	
	//void kaporta() {}    hata verdi
	// 3 cozum yolu sunuyor
	// 1 ya default yap
	// 2 ya static yap
	// 3 ya da body yi sil diyor
	
	
	// e bir method 2 tane access modifier iceremezdi
	// ve interfaceler yazmasak bile otomatik olarak public kabul ederdi
	// dolayisiyla buradaki default kelimesi aslinda bir access modifier degil
	// javanin interfacete bir methoda body ekleyebilmemizi saglamak amaciyla ozel olarak tanimladigi bir keyworddur
	
	// interface'de body'si olan bir method yazmak istersek java bize 2 alternatif sunar
	// 1. methodun basina 'default' keyword yazabiliriz
	// ancak burada yazilan defult access modifier degil javanin interface icin ozel olarak kabul ettigi bir keyworddur
	// default yazmak demek ben bu methodda body kullanacagim demektir
	// ancak methodun body si olmasi demek bu methodun concrete method oldugu anlamina gelmiyor
	// bu default eskiden bildigin default degil, inrterface icinde bambaska bir anlam kazaniyor
	
	// 
	public default void kaporta() // 2.method
	{
		System.out.println("Default keyword sayesinde body olusturabildik.");
		
	}
	
	public static void sanzuman() // 3.method
	{
		System.out.println("Static keyword sayesinde body olusturabildik.");
	}
	
	

}
