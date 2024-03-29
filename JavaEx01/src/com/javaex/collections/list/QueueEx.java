package com.javaex.collections.list;

import java.util.LinkedList;
import java.util.Queue;

//	코딩테스트 문제
//	Queue 직접 구현해보기 !!!
public class QueueEx {
	public static void main(String[] args) {
		
		//	Queue는 인터페이스, 실체 클래스는 List 관련 실체 클래스 사용
		Queue<Integer> queue = new LinkedList<>();
		
		//	데이터 제공
		for(int i = 0; i < 10; i ++) {
			queue.offer(i);
			System.out.println("QUEUE : " + queue);
		}
		
		//	데이터 확인
		int item = queue.peek();	//	인출은 안됨
		System.out.println("PEEK : " + item);
		System.out.println("QUEUE : " + queue);
		item = queue.poll();	//	데이터 인출
		System.out.println("POLL : " + item);
		System.out.println("QUEUE : " + queue);
		
		//	queue에서 poll을 할 때, 비어있는지 반드시 확인
		while(!queue.isEmpty()) {
			System.out.println("POLL : " + queue.poll());
			System.out.println("QUEUE : " + queue);
			}
		
	}

}
