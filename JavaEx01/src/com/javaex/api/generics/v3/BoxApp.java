package com.javaex.api.generics.v3;

public class BoxApp {
	public static void main(String[] args) {
		
		//	Generic 으로 설계된 클래스는 
		//	new(인스턴스화) 할 때 내부 데이터 타입을 지정할 수 있다.
		//	Key 타입이 String, Value 타입이 int
		
		GenericBox<String, Integer> intBox = new GenericBox<>();
		intBox.setKey("Integer");
//		intBox.setKey(123); 	//	들어갈 수 없다
		intBox.setContent(2021);
//		intBox.setContent("Integer"); 	// 들어갈 수 없다
		
		int retVal = intBox.getContent();	//	캐스팅 불필요
		System.out.println("키 : " + intBox.getKey() + "\n값 : " + retVal);
		
	}
}
