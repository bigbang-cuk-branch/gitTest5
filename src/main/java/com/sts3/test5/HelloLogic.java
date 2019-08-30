package com.sts3.test5;

public class HelloLogic {
	String msg = "충돌상황을 가정해보자";
	public void ComfilctTest() {
		System.out.println("로컬의 브랜치를 원격으로 push하면			");
		System.out.println("현재 원격저장소에 저장된 내용이				");
		System.out.println("로컬에서 작업한 내용과 다를부분이 있으면		");
		System.out.println("git이 수정가능여부를 판단하여 merge를 합니다.	");
		System.out.println("그러나 판단이 되지 않을경우 충돌이 일어나고		");
		System.out.println("push는 실패하게 됩니다.					");
	}
}
