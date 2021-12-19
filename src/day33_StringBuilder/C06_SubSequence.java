package day33_StringBuilder;

public class C06_SubSequence {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java ne kadar kolay");
		
		sb.substring(14); 
		System.out.println(sb); // kolay yazdi
		// bize dondurecegi sey string olur, method okumayi bil
		// eger geri donen seyi string olarak kullanacaksan, string manupulation islemleri yapacaksan bu method faydali olur


		sb.subSequence(14,19); // atama yapmaz !!!
		System.out.println(sb.subSequence(14,19)); // kolay yazdi
		
		// sb.substring(14). dersen tum string methodlarini gorursun
		// sb.subSequence(14,19). dersen method gelmez vunku burasi sequence, yani karakterlerin yan yana yazilmis halidir 

	}

}
