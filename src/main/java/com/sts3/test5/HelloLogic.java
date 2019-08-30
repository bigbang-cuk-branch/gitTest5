package com.sts3.test5;

public class HelloLogic {
	String msg = "로컬에서 작업한 내용을 원격으로 push해보자";
	
	public void PushToRemote() {
		System.out.println("앞서 배운대로 작업영역에서 변경된 내용은			");
		System.out.println("로컬저장소의 commit후보로 unstage상태가 됩니다.");
		System.out.println("이를 stage영역에 올리고 로컬저장소에 commit하고");
		System.out.println("원격저장소에 push하면 됩니다.				");
	}
}
