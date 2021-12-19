package day34_AccessModifiers_Encapsulation;

public class C02 {

	public static void main(String[] args) {
		
		// baska class'ta static methoddan erisim
		
		C01 obj = new C01();
				
		// System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		
		// private variable'lara kendi class'i disindan ulasilamaz

	}
	
	public void ststicOlmayanMethod() 
	{

		// baska class'ta static olmayan methoddan erisim
		
		C01 obj = new C01();
		
		// System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		
	}


}
