package dami.dongbinna;

public class D05_Ex03_재귀_함수_예제 {
	public static void main(String[] args) {
		recursiveFunction();
	}

	static void recursiveFunction() {
		System.out.println("재귀 함수를 호출합니다.");
		recursiveFunction();
	}
}
