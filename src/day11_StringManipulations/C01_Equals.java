package day11_StringManipulations;

public class C01_Equals {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a+0;
		
		System.out.println(a==b); // true
		
		char ch1 = 'K';
		char ch2 = 'K' + 0; // char ifadeler matematiksel islemlere girebilirler (with ascii table)
		
		System.out.println(ch1==ch2); // true 

		String str1 = "Ali";
		String str2 = "Can";
		String str3 = "Ali Can";
		String str4 = str1 + " " + str2;
		
		System.out.println(str4); // Ali Can
		System.out.println(str3==str4); // false   --> degerler ayni ancak bunlar farkli objeler oldugu icin false yazdirdi
		System.out.println(str3.equals(str4)); // true 
		
		// steak memoryde bulunan veriler birbirleriyle == ile karsilastirilabilirler
		// burada == yalnizca degerleri karsilastiracaktir (String classi equals() methodu gibi)
		// ancak heapde bulunan referance tipli veriler karsilastirilirken == hem degere hem de referance degerine bakar
		// yani deger ayni olasa bile reference ayni degilse true vermez
		// bu durumun onune gecmek icin String ifadelerde equals() methodunu kullaniriz
		
		// String variable'larda == hem degere hem de referanceina bakar
		// Dolayisiyla objeler farkli oldugunda genelde false doner 
		// str1.equals(str2) ise referencelara degil SADECE DEGERE bakar 
		// eger case sensitive olarak String degerleri ayni ise true doner 
		
	}

}
