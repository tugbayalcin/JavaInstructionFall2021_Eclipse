package Day43_Interface;

public class C03_Concrete implements C02_Interface {
	
	// implement edilmis dikkatttttt

	public static void main(String[] args) {
		
		C03_Concrete concreteObje = new C03_Concrete();
		
		// interface'de default keyword'ünü kulanarak olusturdugumuz body'si olan methodlara child concrete class'lardan obje vasitasiyla ulasabilirim
		concreteObje.kaporta();
		//concreteObje.sanzuman()   --> ulasilamiyor
		
		// interface'de static keyword'ünü kulanarak olusturdugumuz body'si olan methodlara child concrete class'lardan interface ismi vasitasiyla ulasabilirim
		//C02_Interface.kaporta();   --> ulasilamiyor
		C02_Interface.sanzuman();
		
		

	}

	// tum methodlarini implement etmedi
	// sadece body'siz olani implement etti
	// bir interface'de static veya default keyword kullanarak body'si olan bir method olusturursak
	// bu interface'i implement eden concrete child class'lar bu methodlari implement etmek zorunda degillerdir
	
	@Override
	public void motor() {
		
		
		
	}

}
