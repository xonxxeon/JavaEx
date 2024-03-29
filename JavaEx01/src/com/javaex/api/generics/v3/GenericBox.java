package com.javaex.api.generics.v3;

//	Generic
//	T : Type
//	R : Return Type
//	K : Key
//	V : Value
//	...다양한 템플릿 문자를 사용할 수 있다
public class GenericBox<K, V> {	//	내부에서 사용할 key, value의 타입을 미정 상태로 설계
	
	K key;
	V content;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getContent() {
		return content;
	}
	public void setContent(V content) {
		this.content = content;
	}
		
}
