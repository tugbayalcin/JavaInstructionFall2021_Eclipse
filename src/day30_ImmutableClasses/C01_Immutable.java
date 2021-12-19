package day30_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	  public static void main(String[] args) {
		  
		  // String immutable bir class iken, List mutable'dir
		  
		  String str = "Ali";
		  
		  str.toUpperCase(); // str --> ALI yapar
		  // ancak burada bir atama islemi yok, dolayisi ile degisiklik su anda henuz havada bekliyor
		  
		  System.out.println(str); // Ali
		  // burada biz str'yi ALI'ye cevirdigimiz halde Ali yazacak, cunku degisiklik havada bekliyor, atamasi yapilmadi
		  
		  System.out.println(str.toUpperCase()); // ALI
		  // burada str ALI oldu, atama olmadigi icin havada ancak bulundugu yerdeki komut bitmedigi icin o halini yazdirir
		  // tipki methodlara gonderdigin instance variable gibi sout icinde degisikligi, disinda eski halini yazar
		  
		  // Bu olayin sebebi String classinin immutable olmasidir
		  
		  //------------------------------------------------------------------
		  
		  List <String> isimler = new ArrayList<>();
		  // List Classi mutable bir classtir
		  
		  System.out.println(isimler); // [] hiclik yazdirdi
		  
		  isimler.add("Ali");
		  // burada da atama yok ama kalici bir degisklik var
		  
		  System.out.println(isimler); // [Ali] yazar  artik bos yazdirmiyor, icinde Ali olan bir list yazdiriyor
		  
		  isimler.set(0, "Veli"); // [Veli] --> Atama yok ancak degisikligi yazdirdi, havada kalmadi
		  System.out.println(isimler);
		  
		  isimler.remove(0);
		  System.out.println(isimler); // [] --> artik bastaki haline geri dondu
		  
		  
		  
		  
		  
		  
		  
	  }
}
