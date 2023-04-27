package com.bilgeadam.lesson002;

import java.util.Scanner;

/*Dışarıdan vize ve final bilgisi girilsin 
 * daha sonra öğrenci ismi girilsin
 * 
 * çıktı olarak eğer ortlama 60 ın üzerinde ise Mustafa adlı ogrenci geçti çıktısı altında ise
 * Mustada adlı öğrenci kaldı çıktısını verelim
 * 
 * ort=vizenin yüzde 40 finalin yüzde 60 alınsın
 * 
 * 
 */
public class Question8 {

	public static void main(String[] args) {
		
		double vizeNotu, finalNotu,ortalama; 
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Lütfen vize notunuzu giriniz");
		vizeNotu=input.nextDouble();
		
		System.out.println("Lütfen final daha giriniz");
		finalNotu=input.nextDouble();
		
		ortalama=(vizeNotu*0.4) + (finalNotu*0.6);
		
		System.out.println("Lütfen öğrenci ismi giriniz");
		input.nextLine();
		String isim=input.nextLine();
		
		
		
		System.out.println(isim + " adlı Öğrenci" );
		System.out.println(ortalama>60?"Geçti":"Kaldı");
		
		System.out.println();
		String durum= ortalama>60? "Geçti" :"Kaldı";
		
		System.out.println(isim+" adlı ogrenci" + durum + "ort:" + ortalama);
		
			
	
				
	}
	

}
