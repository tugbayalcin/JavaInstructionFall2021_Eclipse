package day32_VarArgs_StringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		
		// Stringler non-primitive data type dir
		// yani aslinda new keyword'u ile olusturulmalidir 
		// ancak java string classi cok fazla kullanildigi icin ona bir kolaylik saglayip 
		// primitive data type'lar gibi tanimlayabilmemize olanak tanimiztir
		// ancak bu kolaylik String Builder veya String Buffer icin gecerli degildir
		
		String str = "Ali Can";
		
		String str2 = new String("Veli Cem");
		
		StringBuilder sb = new StringBuilder("Yasasin Java");
		
		sb.append("!!!"); // atama yok ancak havadsa kalmiyor, atama yapilmis gibi davraniyor cunku String Bbuilder mutable dir, obje uzerinde degisiklik yapti 
		
		System.out.println(sb);
		
		// manipulation methodlari azdir ancak stringe cevirirsek tum string methodlarini da kullanabiliriz
		
		sb.toString().toUpperCase(); // ancak artik string oldugu icin degisiklikler atama yardimiyla kalici hale gelir
		// burasi artik sb objesine atanamaz cunku bbiri stringBuilder, digeri string oldu. Type missmatch olur
		System.out.println(sb);
		

	}

}
