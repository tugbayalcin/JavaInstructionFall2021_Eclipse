package day06_07_WrapperClasses;

public class C04_ConditionalsOperators {

	public static void main(String[] args) {
		
		System.out.println(5+3 ==8 || 6+5==10 || 7-2==3); // true
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3); // false
		
		int a = 10;
		int b = 20;
		int c =30;
		
		boolean sonuc = a>b || b>c || a+b>=c;
		
		System.out.println(sonuc); // veya ile bagli oldugu icin yalnizca 1 tane trıe bulmamiz yetereli olacak --> true
		
		// && isareti yerine & de kullanilabilir. Ancak arada bir nuans farki vardir
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3 && 5>=2 && 7+3<=10); // T && F--> FALSE
		
		System.out.println(5+3==8 & 6+5==10 & 7-2==3 & 5>=2 & 7+3<=10); //  T & F & F & T & T --> FALSE
		
		// java dusunur ki biz sadece sonucla ilgileniyoruz. 
		// Bundan dolayi eger sen && kullaniyorsan ilk false buldugu yerde isleme devam etmeme gerek yok deyip durur ve sonucu yazdirir
		
		// Ancak & kullanirsan tum durumlari muhakkak tek tek kontrol eder ve sonucu yazar
		// Yani arkada biraz daha fazla is yaparak ayni sonucu verir
		
		int yas = 50;
		int boy = 180;
		char cinsiyet = 'M'; 
		
		System.out.println(yas<30 && boy>170 && cinsiyet == 'M'); // F && T && T --> FALSE, java false u gordugu anda digerlerine bakmadi bile

	}

}
