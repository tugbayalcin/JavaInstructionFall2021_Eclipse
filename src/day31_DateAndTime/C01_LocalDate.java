package day31_DateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate tarih = LocalDate.now();
		
		System.out.println(tarih); // 2021-12-02
		// java bu tarihi system'den alir (bilgisayarain systeminden)
		
		System.out.println(tarih.getDayOfYear()); // 336 --> Bugun yilin 336. gunuymus
		System.out.println(tarih.getDayOfMonth()); // 2 --> Bugun ayin 2. gunuymus
		System.out.println(tarih.getDayOfWeek()); // THURSDAY
		System.out.println(tarih.getMonthValue()); // 12 --> 12. aydaymisiz
		System.out.println(tarih.getMonth()); // DECEMBER
		
		
		System.out.println(tarih.plusDays(20)); // 2021-12-22 --> Bugunden 20 gun sonra tarih bu olacakmis
		System.out.println(tarih.plusMonths(5)); // 2022-05-02 --> Bugunden 5 ay sonra tarih bu olacakmis
		System.out.println(tarih.plusWeeks(15)); // 2022-03-17 --> Bugunden 15 hafta sonra tarih bu olacakmis
		System.out.println(tarih.plusYears(15)); // 2036-12-02 --> Bugunden 15 yil sonra tarih bu olacakmis
		
		// 10 yil 10 ay 10 gun eklemek istersem hepsini ayri ayri yapmak zorunda degilim:
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10)); // 2032-10-12 --> Bugunden 10 yil 10 ay 10 gun sonra
		
		
		// tarihlerde geri de gidebiliriz:
		System.out.println(tarih.minusDays(20)); // 2021-11-12 --> Bugunden 20 gun once tarih bu olacakmis
		System.out.println(tarih.minusWeeks(20)); // 2021-07-15 --> Bugunden 20 hafta once tarih bu olacakmis
		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5)); // 2016-06-27 --> Bugunden 5 yil 5 ay 5 gun once tarih bu olacakmis
		
		System.out.println(tarih.minusYears(21).isLeapYear()); // true --> Bugunden 21 yil once artik yil mi
		
		
		LocalDate dogumTarihi1 = LocalDate.of(1998, Month.JANUARY, 12); // yil-ay-gun girildi
		LocalDate dogumTarihi2 = LocalDate.ofYearDay(2000, 136); // yil ve gun girildi
		LocalDate dogumTarihi3 = LocalDate.of(1985, 10, 10); // yil-ay-gun girildi
		
		
		System.out.println(dogumTarihi1 + ", " + dogumTarihi2);
		
		// hangi dogum tarihi daha once kontrol edelim
		System.out.println(dogumTarihi1.isAfter(dogumTarihi2)); // false
		System.out.println(dogumTarihi3.isBefore(dogumTarihi1)); // true
		System.out.println(dogumTarihi1.isEqual(dogumTarihi2)); // false
		
		

	}

}
