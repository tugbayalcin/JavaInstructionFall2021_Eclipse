package day35_Encapsulation_Inheritance;

public class Muhasebe extends Personel {

	protected int saatUcreti;
	protected String statu;
	protected int maas;
	
	public Muhasebe() 
	{
		System.out.println("Muhasebe parametresiz constructor calisti");
	}
	
	
	
	public static void main(String[] args) {
		
		Muhasebe calisan1 = new Muhasebe();
		
		calisan1.isim = "Ali";
		System.out.println(calisan1.soyisim); // henuz atama yapilmadigi icin null yazar
		// getter ve setter olmadan rahatlikla erisim saglayip degisiklik ve atama yapabiliyoruz 
		
		

	}
	
	protected int maasHesapla() 
	{
		int maas = 8*25*saatUcreti; // (gunde 8 saat*ayda 25 gun*saatlik ucret)
		
		return maas;
	}

}
