package day34_AccessModifiers_Encapsulation;

public class C04_PublicVeriPaylasimi {

	public static void main(String[] args) {
		
		C03 obj = new C03();
		
		System.out.println(obj.isim); // Ali  -->obje uzerinden diger classtaki variable'lara erisebiliyorum
		System.out.println(obj.maas); // 10000
		
		obj.isim = "Veli Cem";
		obj.maas = 15000;
		
		System.out.println(obj.isim); // Veli Cem  -->obje uzerinden diger classtaki variable'lar icin degisiklik yapabildim
		System.out.println(obj.maas); // 15000
		
		// eger variable'lar publis ise diger classlardan erisebilir ve degisiklik yapabiliriz 
		

	}

}
