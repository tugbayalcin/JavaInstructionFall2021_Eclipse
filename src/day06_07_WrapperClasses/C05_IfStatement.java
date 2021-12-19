package day06_07_WrapperClasses;

public class C05_IfStatement {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// if statementler her kosulda calisirlar
		// ancak kosul bildiren ifade false olursa body icine girmeden siradski koddan devam ederler
		// bu durum if'in calismadigi anlamina gelmez, yalnizca kosulun saglanmadigi anlamina gelir
		
		if(a>5) // sart saglandigi icin icine girecek
		{
			System.out.println("a sayisi 5'ten buyuktur"); // sart saglandigi icin yazdirilacak
		}
		
		if(a>b) // sart saglanmadigi icin icine girmeyecek siradaki satirdan devam edecek
		{
			System.out.println("a sayisi b'den buyuktur");
		}
		
		if(b>100)  // if'in kendisi calisti ve sart saglanmadigi icin body'ye calismama emri verdi
		{
			System.out.println("b sayisi 100'den buyuktur");
		} 
		
		// basit if cumleleri birbirinden bagimsiz olarak calisir
		// her bir if cumleri kendi sartina baglidir
		// sart saglanirsa (true ise)if bodysi icerisindeki kodlar calistirilir
		// sart saglanmaz ise (false ise) body icerisindeki kodlar calistirilmazlar
		
		// tum if'lerin body'si calisabilir, bazilari calisabilir, hicbirinin bodysi calismayabilir. 
		//  a=500 b=200 durumu				   a=10 b=20 durumu        a=10 b=200 durumu
		
		// sart cumlesi boolean olmak zorundadir!!!
		
		

	}

}
