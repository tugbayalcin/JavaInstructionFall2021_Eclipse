package day34_AccessModifiers_Encapsulation;

public class C01 {
	
	private int sayiPrivate =10; // private class uyelerine sadece icinde bulundugu classtan ulasiriz
	
	int sayiDefault =20; // default class uyelerine sadece icinde bulıundugu class'tan ulasilabilir, Package access modifier olarak da bilinir
	
	protected int sayiProtected =30; // protected class uyelerine icinde bulundugu package icindeki tum classlar ve baska package'lardaki child classlar ulasabilir
	
	public int sayiPublic =40; // public class uyelerine tum package'lardaki tum class'lardan ulasilabilir
	

	public static void main(String[] args) { 
		
		// static methoddan erisim
		
		C01 obj = new C01();
		
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		

	}
	public void ststicOlmayanMethod() 
	{

		// static olmayan methoddan erisim
		
		C01 obj = new C01();
		
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		
	}

}
