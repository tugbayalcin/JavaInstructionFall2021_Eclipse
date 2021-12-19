package day26_Constructors;

public class CarRunner {

	public static void main(String[] args) {
		
		// Car class'indan bir obje olusturalim
		
		      Car          car1         =       new          Car();
		// class ismi    obje ismi    atama    keyword     constructor call (yaninda parantezi var)
		
		// System.out.println(car1.); dedigimde car classindaki tum tanimlanmis degiskenler dokulur
		// ancak o degiskenlere deger atamalari yapmadigim icin java default degerleri yazar
		
		System.out.println(car1.km); // 0
		
		System.out.println(car1.km + " " + car1.model + " " + car1.renk + " " + car1.yil); // 0 null null 0
		
		// Bir obje olustururken eger obje icin kendi class'inda belirlenen degerleri kullanmak istiyorsam 
		// hicbir degeri kendim atamadan obje olusturabilirim
		// bu durumda hicbir paramtre kullanilmadigi icin default constructor yeterli olacaktir
		
		
		
		// eger obje olusturdugum classtaki degerleri kullanmak yerine kendi degerlerimle bir obje olusturmak istersem 
		// o zaman parametreli constructor olusturmam gerekir
		
		// Car car2 = new Car("Kirmizi", "Corolla");
		
		// Car classinda 2 string parametresi olan bir constructor olmadigi icin bu obje olusturmayi simdilik yapamayiz

	}

}
