package day33_StringBuilder;

public class C01_LengthAndCapacity {
	
	 public static void main(String[] args) { 
		 
		 
		 StringBuilder sb = new StringBuilder(0); // 0 eleman kapasiteli olusturduk
		 
		 sb.length(); // String Builder'in uzunlugunu verir
		 System.out.println(sb.length()); // 0 yazdi --> sb nin kullanilan kisminin uzunlugunu verir
		 
		 sb.capacity(); // String Builder'in kapasitesini verir (baslangicta belirtmezsek 16 olarak olusuyordu)
		 System.out.println(sb.capacity()); // 16 yazdi --> sb nin capasity'sini yani mevcut haliyle sahip oldugu tum kutularin sayisini
		 
		 
		 StringBuilder sb2 = new StringBuilder("Java Candir");
		 System.out.println(sb2.length()); // 11
		 System.out.println(sb2.capacity()); // 27
		 
		 
		 StringBuilder sb3 = new StringBuilder(7);
		 sb3.append("Mehlika");
		 System.out.println(sb3.length()); // 7
		 System.out.println(sb3.capacity()); // 7
		 
		 
		 StringBuilder sb4 = new StringBuilder(7);
		 System.out.println(sb4.length()); // 0
		 System.out.println(sb4.capacity()); // 7
		 
		 sb4.append("Nilgun");
		 System.out.println(sb4.length()); // 6
		 System.out.println(sb4.capacity()); // 7
		 
		 sb4.append(" candir");
		 System.out.println(sb4.length()); // 13
		 System.out.println(sb4.capacity()); // 16   --> java (onceki capasity*2)+2 seklinde capasite arttirimi yapiyor
		 
		 sb.append("Java");
		 System.out.println(sb); // Java
		 
		 sb.append(" candir"); 
		 System.out.println(sb); // Java candir
		 
		 sb.append("anlasildi mi", 3, 6); // 3. karakterden baslayip 4. ye kadar yazdirdi. Baslangic dahil bitis dahil degil
		 System.out.println(sb); // Java candirasi
		 
		 
		
		 
		  
		 
	 }

}
