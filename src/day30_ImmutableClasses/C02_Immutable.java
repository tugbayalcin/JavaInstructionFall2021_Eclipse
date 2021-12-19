package day30_ImmutableClasses;

public class C02_Immutable {

	public static void main(String[] args) {
		
		String str = "Ali"; // 1 obje olustu
		
		for(int i=0; i<100; i++) 
		{
			str += " "; // 100 kere calisacagi icin 100 kez obje olusturuldu
		}
		
		// bu kod calistiginda java kac obje olusturur --> 101
		
		// bu kod calistiginda biz ekranda Ali'den baska bir sey gormeyiz ama java arkada 101 obje olusturmus olur
		// str'nin son degeri Ali (100 tane bosluk), highlite edersen gorersin
		
		System.out.println(str);

	}

}
