package Day42_Abstraction;

public class Ustabasi extends Isci {
	
	public void statu() // override
	{
		System.out.println("Bu Classtaki Tum Pesonel Ustabasidir. \nImza: Ustabasi\n");
	}
	
	public void maas() // override
	{
		System.out.println("Ustabasi'lati Aylik 10.000 TL Maas Alir. \nImza: Ustabasi\n");
	}
	
	public void mesai() // override
	{
		System.out.println("Ustabasi Ariza Durumunda Ariza Cozulunceye Kadar Calisir. \nImza: Ustabasi\n");
	}
	// bu methodlari /* */ icien alsak bile java itiraz etmez ve asagidaki kodlar genel ozellikleri yazdirir

	
	// obje olusturdugumuz en alttaki class parent class'lardaki ozellikleri/methodlari override edince 
	// class'dan olusturulan objeler en dogru ve spesific bilgilere kavustu 
	
	// ama clasic parent-child iliskisinde tum methodlari override etme mecburiyeti yoktur
	
	// Java parent class'lardaki tum methodlari override etmek mecburiyeti kazandirmak icin abstract class yapisini olusturmustur
	// Yani bir classi abstract olarak tanimlarsak child class'lar tum methodlari override etmek zorunda kalir 
	
	// Dolayisiyla Abstract yaptigimiz parent classlar sadece kalip gorevi yapacaklar 
	public static void main(String[] args) {
		
		Ustabasi ust1 = new Ustabasi();
		
		ust1.statu(); // override methodlar calisir
		ust1.maas(); // override methodlar calisir
		ust1.mesai(); // override methodlar calisir

	}

}
