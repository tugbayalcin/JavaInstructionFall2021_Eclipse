package day42Abstraction;

public class AbstractUstabasi extends AbstractIsci{
	
	// bu class ya abstract olmali
	// ya da parent methodlarini override etmeli(implement et kendine uyarla diyor)
	// yoksa java kiziyor
	
	// concrete bir child class parent'i olan abstract class'lardaki tum abstract methodlari implement etmek zorundadir
	// Ama parent'i olan abstract class'lardakiconcrete methodlari implement etmek zorunda degildir
	// isterde eder istemezse etmez 

	public static void main(String[] args) {
		
		AbstractUstabasi ust1 = new AbstractUstabasi();
		ust1.statu();
		ust1.maas();
		ust1.statu();

	}

	@Override // implement/uyarlama
	public void mesai() {
		// burada override ettigimiz methodun icini kendimize gore doldurmamiz gerekiyor 
		// doldurmasak da olur
		
	}

	@Override // implement/uyarlama
	public void maas() {
		// burada override ettigimiz methodun icini kendimize gore doldurmamiz gerekiyor 
		// doldurmasak da olur
		
	}

	@Override // implement/uyarlama
	public void statu() {
		// burada override ettigimiz methodun icini kendimize gore doldurmamiz gerekiyor 
		// doldurmasak da olur
		
	}

	@Override
	public void abstractMethod() {
		// bunu da ekledi
		
	}
	
	

}
