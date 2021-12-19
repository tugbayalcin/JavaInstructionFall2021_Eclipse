package day27_ConstructorCall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {
		
		// Javanin olusturdugu default constructor ile obje olusturabiliyoruz
		// ama her obje icin yeniden deger atamasi yapmak uzun oluyor
		// istersek parametreli constructor'lar olusturup daha obje olusurken istedigimiz ozellikleri atayabiliriz
		
		Car1 car1 = new Car1(50000,  "Vectra",      "Beyaz",       2015,        true);
						 // (int km, String model, String renk, String yil, boolean satilikMi

		// hata verip bize 2 teklif sunuyor
		// 1: ya git constructor icine yazdigin degerleri sil ve parametresiz olani kullan
		// 2: ya da yazdiklarina uygun bir constructor olustur
		
		
		Car1 car2 = new Car1(35000); // yalnizca km degerini degistirip diger degerleri default alan constructor
						  // int km
		
		System.out.println(car2.km); // 35000
		
		
		Car1 car3 = new Car1();
		System.out.println(car3.km); // 0
		
		Car1 car4 = new Car1(1000);
		System.out.println(car3.km); // 1000
		
		
		// yil ve km'yi parametre olarak girebilecegimiz bir constructor daha olusturabilir miyim?
		
		Car1 car5 = new Car1(2020,5000);
        //(yil,  km)
		
		 System.out.println(car5.yil + " " + car5.km + " " + car5.model);
	        //                   2020             5000            null 
		
		
		
		
		
	}

}
