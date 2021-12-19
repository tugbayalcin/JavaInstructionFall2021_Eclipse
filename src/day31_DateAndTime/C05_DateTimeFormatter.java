package day31_DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat = LocalDateTime.now();
		
		System.out.println(tarihSaat); // 2021-12-02T23:45:25.441
		
		// Eger tarih veya saati kendi istedigimiz bicimde yazdirmak istersek
		// mesela gun/ay/yil  saat.dakika olarak yazdirmak isteyelim
		
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd/MM/YYYY  HH:mm  a"); 
		// gun:day -> dd  //  ay:month -> MM (minute ile karismasin diye buyuk)  // yil:year YYYY
		// saat:hour -> HH (hh: 12'lik saat Dilimi, HH 24'luk saat dilimi)   // dakika:minute ->mm  (kucuk)
		System.out.println(duzenle.format(tarihSaat));
		
		/*
		  Format olustururken ;
		  
		  GUN: 
		  d          : basta 0 varsa onu yazmadan gun numarasini yazar
		  dd         : tek haneli gunleri 01 gibi basina 0 koyarak yazar
		  DDD        : yilin kacinci gunu oldugunu yazar
		  E, EE, EEE : gun isminin ilk 3 harfini yazar
		  EEEE       : gun isminin tamamini yazar
		  
		  AY: (Ay icin M, dakika icin m kullanilir)
		  M        	 : basta 0 varsa onu yazmadan ay numarasini yazar
		  MM         : tek haneli aylari 01 gibi basina 0 koyarak yazar
		  MMM        : ay isminin ilk 3 harfini yazar
		  MMMM       : ay isminin tamamini yazar
		  
		  YIL:
		  YY         : yilin son 2 rakamini yazar
		  YYYY       : yilin tamamini yazar 
		  
		  SAAT: (h->12'lik saat dilimi,  H->24'luk saat dilimi)
		  H          : tek rakamli saat olursa 02 gibi yazar          --? kendin kontrole t bunu
		  HH         : saatin tamamini yazar
		  
		  a          : sonuna AM veya PM ekler
		  
		  
		  
		  
		 */

	}

}
