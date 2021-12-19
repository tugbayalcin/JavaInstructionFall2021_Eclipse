package day42_Abstraction;

public abstract class AbstractPersonel {
	
	public abstract void statu();
	
	// class ve method'u abstract olarak tanimladigimizda child class'lar mecburen bu methodu override edeceklerdir
	// zaten parent classtaki method gecersiz kilinacak ve calistirilmayacak(override demek parent'inmethodunu ez ve kullanma, kendininkini kullan demek)
	// bu sebeple abstract class'larda method body yer almaz 
	// ben sana ne yapmak zorunda oldugunu soyleyecegim ancak nasil yapacagini soylemeyecegim onu da sen belirle diyor
	
	public void concretMethod() 
	{
		System.out.println("AbstractPersonel Class'indaki Concret Method Calisti");
	}
	// bu method implement edilmek zorunda degildir
	
	
	public abstract void abstractMethod();
	// sonradan ekledik ve childlar implement edene kadar hata verecek
	

}
