package day11_StringManipulations;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		
		// equalsIgnoreCase() iki Stringi karsilastirirken case sensitive olmadan kiyaslama yapar
		
		
		String str1 = "ali";
		String str2 = "can";
		String str3 = "Ali Can";
		String str4 = str1 + " " + str2;
		
		System.out.println(str4); // ali can
		System.out.println(str3==str4); // false   --> degerler bile ayni degil aslinda, hem degerler hem reference farli
		System.out.println(str3.equals(str4)); // false  --> degerler de farkli
		System.out.println(str3.equalsIgnoreCase(str4)); // true --> icerik ayni ve case sensitive degil 
		// case sensitive ozelligini devre dısı bırak, buyuk kucuk harf uyumunu goz ardi et demek
		
	}

}
