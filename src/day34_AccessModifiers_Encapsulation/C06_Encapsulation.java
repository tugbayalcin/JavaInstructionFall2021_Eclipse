package day34_AccessModifiers_Encapsulation;

public class C06_Encapsulation {

	public static void main(String[] args) {
		
		C05 obj1 = new C05();
		System.out.println(obj1.getAsgariMaas()); // 4000 --> goruntuleyebiliyorum 
		// obj1.getAsgariMaas() =3000;   degisiklik yapamiyorum
		
		// C05 class'inda asgari maasi private yapip getter() methodu kullandigim icin asgari maasi gorebiliyorum ama degistiremiyorum
		
		// classic access modifier'larimiz ile bir variable'a ulasabilirsek istedigimiz zaman degistirme secenegimiz de olur

	}

}
