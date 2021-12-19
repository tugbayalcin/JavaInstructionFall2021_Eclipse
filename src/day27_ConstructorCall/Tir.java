package day27_ConstructorCall;

public class Tir {

	
	
		
		int yil=2000;
		String renk;
		String model;
		int km;
		boolean satilikMi;
		
		public Tir(int i, String string, String string2, int j, boolean b) {
				// int km, String model, String renk, int yil, boolean satilikMi
			// tir runner classindan yolladigimiz degerlerin instance variable'larla eslesmesi icin atamalari yapmam lazim
			// siralama onemli
			km =i;
			model = string;
			renk = string2;
			yil =j;
			satilikMi = b;
		}

		public Tir(int km, String model, String renk) {
			
			
			// i, string ve string2 isim olarak guzel isimler degil
			// kodumuzu sonradan incelerken anlasilir degil
			// daha anlasilir olmasi icin variable isimlerini anlamli yapalim
			// int km, String model, String renk
			
			this.km=km;
			this.model=model;
			this.renk=renk;
			
			// basina this. yazdigimizda java bu variable'in class level'daki variable oldugunu anlar
		}

		
		

	

}
