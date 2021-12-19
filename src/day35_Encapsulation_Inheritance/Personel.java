package day35_Encapsulation_Inheritance;

public class Personel {

	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	Personel() 
	{
		System.out.println("Personel parametresiz constructor calisti");
	}
	
	// bu degiskenler yalnizca bulundugu package icinden erisilebilirler cunku access modifierlari yok, bundan dolayi default yani package variablelar
	// inheritance icin protected yapmaliyiz ki, baska packagedan bile olsa tum cocuklarimiz gorebilsin
	// public olursa herkes ama herkes erisir, bunu da istemeyiz
	
	
	// eger variable'lara access modifier yazmazsak java access modifier olarak default access modifier atar
	// boyle olursa sadece o package altindaki child classlar Personel classini inherit edebilir 
	// baska package lardaki child classlarin da Personeli inherit edebilmesi icin 
	// variable ve methodlarin access modifierlarini protected yapariz 
	// public yapasak da inehrit edilebilir ancaj biz hekesin erismesini degil de sadece child classlarin erismesini istedigimizden
	// protected i tercih ederiz 
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		

	}

}
