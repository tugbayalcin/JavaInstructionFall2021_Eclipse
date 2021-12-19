package Day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_Set {

	public static void main(String[] args) {
		
		Set<Object> s1 = new HashSet<>(); // <Integer> yazsaydik yalnizca int elemani olabilirdi
		
		s1.add(4);
		s1.add(7);
		s1.add(11);
		
		System.out.println(s1); // [4, 7, 11]   --> sirali yazdirmak zorunda degil, karisik da yazdirabilir, cunku index yok
		
		s1.add("Java Candir");
		System.out.println(s1);
		
		List<Object> liste = new ArrayList<>();
		
		liste.add(5);
		liste.add("Java super ");
		liste.add(true);
		liste.add('c');
		liste.add(s1);
		

	}

}
