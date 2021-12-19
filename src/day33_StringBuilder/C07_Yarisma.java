package day33_StringBuilder;

public class C07_Yarisma {

	public static void main(String[] args) {
		
		// Soru : For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani kontrol edip StringBuilder ve String class’larinin performanslarini karsilastiralim.   
		// Ipucu: long TimeSb = System.nanoTime(); kullanalim
		
		String str = "Merhaba";
		StringBuilder sb = new StringBuilder("Merhaba");
		sb.trimToSize(); // capasity'yi length() ile esitler !!!
		
		long time1 = System.nanoTime();
		
		for(int i=0; i<1000; i++) 
		{
			str += " ";
		}
		long time2 = System.nanoTime();
		
		long stringSure = time2-time1;
		
		
		long time3 = System.nanoTime();
		
		for(int i=0; i<1000; i++) 
		{
			sb.append(" ");
		}
		long time4 = System.nanoTime();
		
		long sbSure = time4-time3;
		
		if(sbSure>stringSure) 
		{
			System.out.println("String Daha Hizli");
		}
		else 
		{
			System.out.println("StringBuilder Daha Hizli");
		}
		
		System.out.println(stringSure/sbSure);
		System.out.println("String Sure: " + stringSure);
		System.out.println("StringBuilder Sure: " + sbSure);
		
		

	}

}
