package com.bilgeadam.lesson001;

/*Bir ürünün fiyatında %18 kdv %15 kar payı olduğunu biliyoruz
 * bu ürünün fiyatı elimizde olsun
 * daha sonra bu fiyat üzerinden ürünün ham fiyatı ve kdvli fiyatını bulalım
 * 
 * 
 * 
 */

public class Questions3 {

	public static void main(String[] args) {
	
	int fiyat=100;
	float hamFiyat, kdvsizFiyat; 
	
	kdvsizFiyat=fiyat/1.18f;
	hamFiyat= kdvsizFiyat/1.15f;
	
	
	System.out.println("urun kdvsiz fiyatı:" + kdvsizFiyat);
	System.out.println("urun ham fiyatı:" + hamFiyat);
	
	

		
	}
	
}
