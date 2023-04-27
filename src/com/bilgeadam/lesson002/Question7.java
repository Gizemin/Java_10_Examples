package com.bilgeadam.lesson002;

import java.util.Scanner;

/*Dışardan 2 tane sayıyı alıp toplayalım 
 * ve daha sonra bu sayıyı çift ise ekrana true yazdıralım
 * 
 * 
 */
public class Question7 {
	
	public static void main(String[] args) {
		
		int sayi1, sayi2,sonuc;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Lütfen bir sayı giriniz");
		sayi1=input.nextInt();
		
		System.out.println("Lütfen bir sayı daha giriniz");
		sayi2=input.nextInt();
		
		sonuc=sayi1+sayi2;
		
		System.out.println("sonuc=" + (sayi1+sayi2));
	
	
		boolean kontrol= sonuc%2==0;
		
		System.out.println(kontrol);
		
		
		
	
	}

}
