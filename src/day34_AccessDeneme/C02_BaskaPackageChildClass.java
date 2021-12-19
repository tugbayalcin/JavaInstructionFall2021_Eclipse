package day34_AccessDeneme;

import day34_AccessModifiers_Encapsulation.C01;


public class C02_BaskaPackageChildClass extends C01 {

	public static void main(String[] args) {
		
		// static methoddan erisim
		
		C01 obj = new C01();
				
		// System.out.println(obj.sayiPrivate); --> ERISILEMEDİ
		// System.out.println(obj.sayiDefault); --> ERISILEMEDİ  --> main methoddan ulailamamsinin sebebi static club ile ilgili
		// System.out.println(obj.sayiProtected); ??????
		System.out.println(obj.sayiPublic);
		
		// sayiProtected =60;
		
		
		

	}
	
	public void ststicOlmayanMethod() 
	{

		// static olmayan methoddan erisim
		
		C01 obj = new C01();
		
		// System.out.println(obj.sayiPrivate);
		// System.out.println(obj.sayiDefault);
		// System.out.println(obj.sayiProtected); ????
		System.out.println(sayiProtected); // bu classta sayiProtected diye bir variable olmadigi halde, parent class'ta var oldugu icin java itiraz etmedi
		System.out.println(obj.sayiPublic);
		
	}

}
