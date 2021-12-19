package day27_ConstructorCall;

public class Car1 {
	
	int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	
	public Car1() {} // altta parametreli olusturdugumuz icin artik java kendi olusturdugu parametresiz constructor'i sildi
	// bu yuzden benim elimle olusturmam gerek
	
	public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
		// atama yapacagimiz tum ozellikleri parametre olarak yolladik
		
		
	}
	
	// ben 5 ozelligi birden degistiren bir constructor urettigimde java default constructor'i siler
	// bu durumda daha onceden yazilan ve default constructor'i kullanan tum kodlar coker
	// bu durumda kodlari duzeltmek icin javanin sildigi default constructor yerine parametresiz bir constructor olusturmaliyim
	// parametresiz constructor uretmenin syntax'i  classAdi + () + {} (class adinin basina public de ekleyebilirsin)
	
	

	public Car1(int i) {
		km =i; // bu satiri yazarak asagidaki yazilan her eyi cozmus oluyoruz 
		
		// bir constructor daha olusturduk, bu constructor yalnizca 1 parametre aliyor, diger degiskenleri default olarak aliyor
		
		// NOTE!!!:  classimizda 2 tane integer deger var, constructor'imiz da int bir deger aliyor,
		// peki java buraya gelen integer'in hangisi oldugunu nereden bilecek
		// ismini degistirerek ayni yapabiliriz ancak
		// constructor icerisine yazdigimiz degisken adi yalnizca kullanici anlasin diye yazilir
		// java isimleri ayni diye class icindeki km ile constructor icindeki km nin ayni oldugunu dusunmez,
		// cunku bu ikisinin scope'lari farklidir
	}

	public Car1(int i, int j) {
		yil =i;
		km =j;
	}

	public void hiz(int hiz) 
	{
		System.out.println("Araba saatte " + hiz + " km hiz yapar.");
	}
	
	public void  yakit(String yakit) 
	{
		System.out.println("Araba yakit olara  " + yakit + " kullanir.");
	}
	
		


}
