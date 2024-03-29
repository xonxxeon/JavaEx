package com.javaex.problem02;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("친구를 3명 등록해 주세요");

        for (int i = 0; i < friendArray.length; i++) {
        // 친구정보 입력받기
        	String fr = sc.nextLine();
        // 입력받은 친구정보를 공백으로 분리
        	String words[] = fr.split(" ");
        // Friend 객체 생성하여 데이터 넣기
        	friendArray[i] = new Friend(words[0], words[1], words[2]);
        // 배열에 추가하기
        }
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
