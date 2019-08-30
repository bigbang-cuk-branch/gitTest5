package com.sts3.test5;

public class HelloLogic {
	String msg = "로컬에서 작업한 내용을 원격으로 push해보자";
	
	public void PushToRemote() {
		System.out.println("앞서 배운대로 작업영역에서 변경된 내용은			");
		System.out.println("로컬저장소의 commit후보로 unstage상태가 됩니다.");
		System.out.println("이를 stage영역에 올리고 로컬저장소에 commit하고");
		System.out.println("원격저장소에 push하면 됩니다.				");
	}
	String msg = "충돌상황을 가정해보자";
	public void ComfilctTest() {
		System.out.println("로컬의 브랜치를 원격으로 push하면			");
		System.out.println("현재 원격저장소에 저장된 내용이				");
		System.out.println("로컬에서 작업한 내용과 다를부분이 있으면		");
		System.out.println("git이 수정가능여부를 판단하여 merge를 합니다.	");
		System.out.println("그러나 판단이 되지 않을경우 충돌이 일어나고		");
		System.out.println("push는 실패하게 됩니다.					");
		
		System.out.println("MergeTool을 사용하여 이 영역에서 수정하거나");
		System.out.println("직접 충돌난 코드를 열어 직접 수정해도 됩니다. ");
	}
}
