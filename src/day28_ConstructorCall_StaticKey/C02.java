package day28_ConstructorCall_StaticKey;

public class C02 {
	
	int x=5; // instance variable
	static int y = 10; // static variable
	
	// static avriable'lar class'a baglidir, memthod icinde olusturamazsin

	public static void main(String[] args) {
		
		
		// 3 tane obje olusturalim ve degisimleri gozlemleyelim
		
		C02 obje1 = new C02();
		System.out.println("obje1 icin x: " + obje1.x + " obje1 icin y: " + obje1.y); // obje1 icin x: 5 obje1 icin y: 10
		
		// x++; bu satir hata verir cunku biz x'e dogrudan erisemiyoruz
		// y++; burasi hata vermez cunku static variable
		
		obje1.x++;
		obje1.y++;
		System.out.println("obje1 icin x: " + obje1.x + " obje1 icin y: " + obje1.y); // obje1 icin x: 6 obje1 icin y: 11
		
		C02 obje2 = new C02();
		System.out.println("obje2 icin x: " + obje2.x + " obje2 icin y: " + obje2.y); // obje2 icin x: 5 obje2 icin y: 11
		
		obje2.x++;
		obje2.y++;
		System.out.println("obje2 icin x: " + obje2.x + " obje2 icin y: " + obje2.y); // obje2 icin x: 6 obje2 icin y: 12
		
		System.out.println("Obje 2 olusturulduktan ve islemden sonra obje 1'in " + " x : " + obje1.x + " y: " + obje1.y);
		
		C02 obje3 = new C02();
		obje3.x= 20;
	    obje3.y=40;
	    
	    
	    
		System.out.println("obje3'den sonra obje1'in x: " + obje1.x ); // 6
		System.out.println("obje3'den sonra obje2'in x: " + obje2.x ); // 6
		System.out.println("obje3'den sonra obje3'in x: " + obje3.x ); // 6

		
		

	}

}
