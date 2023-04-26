package com.bilgeadam.lesson001;

public class Question1 {

	//primitive(ilkel) veri tipleri
	/* değişken isimlerini adlandırmada camel case kullanılır
	 * 
	 * ilk harf küçük daha sonra gelen yeni kelime varsa onun ilk harfi büyük olarak devam eder
	 * 
	 */

  public static void main(String[] args) {
	  
  
	int sayi1=5;
	byte myByte=25;
	short myShort=5222;
	long myLong=1_000_000_000;
	double myDouble=125.52;
	char myChar='A'; // ctrl alt aşağı yön tuşu bu satırı aşağıya doğruı kopyalar
	char myChar2=65;
	boolean myBoolean=true; //true veya false
	float myFloat=128.65f;
//kısayol çalıştırma ctrl f11
	
	

	System.out.println("int deger==> "+sayi1);
	System.out.println("long deger==> "+myLong);
	System.out.println("byte deger==> "+myByte);	
	System.out.println("short deger==> "+myShort);	
	System.out.println("double deger==> "+myDouble);	
	System.out.println("char deger==> "+myChar);	
	System.out.println("boolean deger==> "+myBoolean);	
	System.out.println("float deger==> "+myFloat);
	
	//Wrapper Class (Sarmalayıcı sınıflar)
	
	Integer myInteger=529;
	Integer myInteger2=null;
	int myInt=0;
	System.out.println("INTEGER==>"+myInteger);
	myInteger2=myInt;
			
	System.out.println("INTEGER==>"+myInteger);
	System.out.println("INTEGER2==>"+myInteger2);
	System.out.println("int==>"+myInt);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	
	System.out.println(Integer.toString(myInt)); // Integer degeri stringe cevirir
	
	System.out.println("Double Max==>"+Double.MAX_VALUE+" min==>"+Double.MIN_VALUE);
	System.out.println("Byte Max==>"+Byte.MAX_VALUE+" min==>"+Byte.MIN_VALUE);
	System.out.println("Float Max==>"+Float.MAX_VALUE+" min==>"+Float.MIN_VALUE);
	System.out.println("Integer Max==>"+Integer.MAX_VALUE+" min==>"+Integer.MIN_VALUE);
	System.out.println("//////////////////////////////////");
	
	long number1=258;
	byte number2=number1;
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String isim="Mustafa";
	System.out.println(isim);
	
	
	}}
	

