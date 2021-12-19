package day34_AccessDeneme;

import day34_AccessModifiers_Encapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		
	// baska package'ta static methoddan erisim
		
		C01 obj = new C01();
		
		// System.out.println(obj.sayiPrivate); --> ERİSİLEMEDİ
		// System.out.println(obj.sayiDefault); --> ERİSİLEMEDİ  --> Sadece ayni package'dakiler erisebilir, baska package'dan erisilemez
		// System.out.println(obj.sayiProtected); --> ERİSİLEMEDİ --> Ayni package'daki classlar ve child classlar erisebilir BURASI CHILD DEGIL
		System.out.println(obj.sayiPublic);

	}
	
	public void ststicOlmayanMethod() 
	{

		// baska package'ta static olmayan methoddan erisim
		
		C01 obj = new C01();
		
		// System.out.println(obj.sayiPrivate); --> ERİSİLEMEDİ
		// System.out.println(obj.sayiDefault); --> ERİSİLEMEDİ
		// System.out.println(obj.sayiProtected); --> ERİSİLEMEDİ
		System.out.println(obj.sayiPublic);
		
	}

}
