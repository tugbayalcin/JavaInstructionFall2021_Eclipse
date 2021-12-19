package day28_ConstructorCall_StaticKey;

public class C03 {

	public static void main(String[] args) {
		
		// java runtime bir programdir
		// run tusuna bastigimizda java calismaya baslar ve islemleri yapar
		// javanin isi bittiginde (calisma tusu kirmizidangriye dondugunde) her sey basa doner
		
		// static variable ve methodlar bulunduklari class ile ilintilidir (obje ile degil class ile )
		// baska bbir classta ken c02'deki static variable veya methoda ulasmak istedigimmizde C02.staticVariableIsmi ve C02.staticMethodİsmi
		// yazmamiz yeterli olur
		
		// 3 tane obje olusturalim ve degisimleri gozlemleyelim
		
				C02 obje1 = new C02();
				System.out.println("obje1 icin x: " + obje1.x + " obje1 icin y: " + C02.y); // obje1 icin x: 5 obje1 icin y: 10
				
				// x++; bu satir hata verir cunku biz x'e dogrudan erisemiyoruz
				// y++; burasi hata vermez cunku static variable
				
				obje1.x++;
				C02.y++;
				System.out.println("obje1 icin x: " + obje1.x + " obje1 icin y: " + C02.y); // obje1 icin x: 6 obje1 icin y: 11
				// static bbir variable' a class ismi uzerinden ulasak yerine instance variable2lar gibi obje ile ulasmaya calsirsak,
				// java compile time error vermez ancaksolda sari unlem isareti ile bizi uyarir
				// static bir field olan c02. y ye atatic yolan ulas der
				
				
				// ayni class icindeyken static variable'lara ulasmak icin objeye ihtiyac yoktur. 
				// kullanirsak java cte vermez fakat static variable'a static yoldan ulas diye bbizi uyarir 
				C02 obje2 = new C02();
				System.out.println("obje2 icin x: " + obje2.x + " obje2 icin y: " + C02.y); // obje2 icin x: 5 obje2 icin y: 11
				
				obje2.x++;
				C02.y++;
				System.out.println("obje2 icin x: " + obje2.x + " obje2 icin y: " + C02.y); // obje2 icin x: 6 obje2 icin y: 12
				
				System.out.println("Obje 2 olusturulduktan ve islemden sonra obje 1'in " + " x : " + obje1.x + " y: " + C02.y);
				
				C02 obje3 = new C02();
				obje3.x= 20;
			    C02.y=40;
			    
			    
			    
				System.out.println("obje3'den sonra obje1'in x: " + obje1.x ); // 6
				System.out.println("obje3'den sonra obje2'in x: " + obje2.x ); // 6
				System.out.println("obje3'den sonra obje3'in x: " + obje3.x ); // 6
				
				System.out.println("obje3'den sonra obje1'in y: " + C02.y ); // 6
				System.out.println("obje3'den sonra obje2'in y: " + C02.y ); // 6
				System.out.println("obje3'den sonra obje3'in y: " + C02.y ); // 6


	}

}
