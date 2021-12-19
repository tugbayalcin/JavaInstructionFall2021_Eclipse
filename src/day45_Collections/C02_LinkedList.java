package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
		// polimorphism kullanarak constructor'i degistirmeden data turunu degistirdik
		// ancak biz artik yalnizca List ozelliklerini lullanabiliriz, Queue'den gelen ozellikleri kullanamayiz
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll);
		
		// ancak List interfaceinin methodlarini override eden LinkedList oldugundan:  method List'ten, calistiran LinkedList olur
		
		ll.add(9);
		
		// data turunu List sectigimiz icin sadece List interface'indeki methodlari kullanabiliriz
		// LinkedList classinda override ettigimiz icin List interface olmasina ragmen List methodlarini kullanabildik
		
		Queue<Integer> ll2 = new LinkedList<>();
		
		ll2.add(5);
		ll2.add(7);
		ll2.clear(); // data turu Queue secildigi icin Queue interface'inden gelen methodlari kullanabildik
		
		Deque<Integer> ll3 = new LinkedList<>(); // hangi uctan baslamayacagina karar verme ozgurlugu sunar
		
		ll3.add(5);
		ll3.add(7);
		ll3.addLast(20);

	}

}
