package com.bilgeadam.lesson002;

import java.awt.im.InputContext;
import java.util.Scanner;

/**
 * 
 * 
 * Dışardan veri alma ile ilgili örnekler
 * 
 * Scanner
 * 
 * 
 * @author gizem
 *
 */
public class Questions5 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		String isim= input.nextLine();
		
		System.out.println("isim=" + isim);
		
		int sayi1=10;
		System.out.println("Lütfen bir sayi giriniz");
		int sayi2=input.nextInt();
		
		System.out.println("sonuc=" + (sayi1+sayi2));
		
		System.out.println("Lütfen bir isim giriniz");
		input.nextLine();
		String isim2=input.nextLine();
		
		System.out.println("isim2:"+ isim2);
		
		
		
		

	}

}
