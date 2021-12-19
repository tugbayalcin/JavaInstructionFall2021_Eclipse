package day20_Scope;

public class C01_InstanceVariables {

	int notMat = 50; // classin icinde, main method disinda tanimlanan degisken, instance variable
	int notFen; // instrance variable oldugu icin deger atamadan da kullanabiliriz
	
	// ınstance variable'lar tum methodlarin disinda olmalidir
	// class seviyesindedir
	// object variable da denir
	
	
	public static void main(String[] args) {
		
		// System.out.println(notMat);
		// main method static oldugu icin, static olamayan variable'lar main method'da direkt kullanilamaz veya goruntulenemezler
		// instance variable'larin scope'unda main method yoktur
		
		// instance variable'lara main methoddan erismek istersek obje olusturup, obje uzerinden erisim saglayabiliriz.
		
		// Scanner scan = new Scanner(System.in); -->  burada aslinda obje olusturuyoruz
		// Biz simdi icinde oldugumuz class'dan bir obje olusturalim
		
		C01_InstanceVariables tugba = new C01_InstanceVariables(); // --> obje olusturduk :)
		System.out.println("Default tugba notMat: "+tugba.notMat); // artik java sorun cikarmiyor, tugba objesi yardimi ile notMat degiskenine eristik -->50
		
		C01_InstanceVariables asel = new C01_InstanceVariables();
		asel.notMat = 70; // ayni degiskene baska objeler uzerinden de erisebiliriz
		// hatta farkli objeler ile ayni degisken uzerinde kalici degisiklikler yapabiliriz
		System.out.println("Deger atanmis asel notMat: "+asel.notMat);
		
		System.out.println(tugba.notMat); // aselin notu degistiyse aseli ilgilendirir tugbayi degil -->50
		// tugbanin notunu degistirmek istiyorsak tugba.notMat'a deger ataaliyiz
		tugba.notMat = 90; // deger atamasi yapiyoruz, atama yalnizca bu objeye ozel olacak
		System.out.println("Deger atanmis tugba notMat: "+tugba.notMat); // -->90
		
		
		// instance variablelarda deger atamasi yapmaz isek java instance olarak atanan degeri alir.
		// bu class icin notMat = 50 gibi
		// ama istersek deger de atayabiliriz, bu durumda deger atadigimiz obje icin yeni deger gecerli olur
		
		// ---------------------------------------------------------------------------------------------------------------
		
		// method2(); // static olmayan method
		// static clubunden olan main method icinden, static club'a uye olmayan methodlar direkt olarak cagirilamazlar
		
		tugba.method2(); // obje ile cagirdigimizda problem ortadan kalkti, ancak sadece ve sadece tugba icin bu method calisacak
		// instance variable'lar icin deger atanmasa da olur. Bu durumda java default degerler atar
		// int icin default deger 0'dir. (tugba sinava girmemis :D)
		
		// method icinde atama yapip yeniden deneyelim
		System.out.println(tugba.notFen); // ancak bu atama su anda yalnizca tugba icin gecerli, cunku methodu tugba objesi ile cagiriyoruz 
		
		

	}
	
	public static void staticMethod() 
	{
		// bir classta main method disinda baska method olabilir
		// bu method static olabilir
		
		// System.out.println(notFen);
		// instance variable'lara static methodlardan direkt ulasilamaz
	}
	
	public void method2() 
	{
		// bir classta main method disinda baska method olabilir
		// bu method static olmayabilir 
		
		System.out.println("Method2'deki notFen: "+notFen); // direk ulasabildik, cunku bu method static degil 
		
		// bu method static olmadigi icin instance variablae'lara direkt ulasabilir
		notFen = 100;
	}

}
