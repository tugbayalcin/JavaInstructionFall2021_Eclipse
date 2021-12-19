package day10_TernarySwitchCase;

public class C13_StringManipulationCharAt {

	public static void main(String[] args) {
		
		// charAt(istenen Index) methodu istedigimiz indexteki karakteri bize verir
		
		String kurs = "TechProEducation";
		System.out.println(kurs.charAt(5)); // r
		
		// indexler 0'dan baslar 

		System.out.println(kurs.charAt(0)); // bize ilk harfi verir
		
		System.out.println(kurs.charAt(15)); // son harfi verir (uzunluk-1)
		
		System.out.println(kurs.charAt(16)); // stringimizin uzunlugundan daha buyuk bir index girdik
		// hata aliriz: index out of bounds --> index sinirlarin otesinde diyor 
	}

}
