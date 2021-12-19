package day34_AccessModifiers_Encapsulation;

public class C05 {
	
	private int asgariMaas = 4000;

	public static void main(String[] args) {
		
		
		
		

	}

	public int getAsgariMaas() {
		return asgariMaas;
	}
	
	// bir class'daki herhangi bir class uyesine ulasilabilsin ama degistirilemesin istiyorsak;
	// 1) class uuyesini private yapabiliriz
	// 2) private class uyelerine hicbir sekilde ulasim olmayacagi icin sadece goprebilme yetkisi verebiliriz 
	//    bunu ise getter() methodu ile yapabiliriz 

}
