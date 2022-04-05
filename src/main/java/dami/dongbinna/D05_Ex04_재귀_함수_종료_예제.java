package dami.dongbinna;

public class D05_Ex04_재귀_함수_종료_예제 {
	public static void main(String[] args) {
		recursiveFunction(1);
	}

	static void recursiveFunction(int i) {
		// 100번째 출력했을 때 종료되도록 종료 조건 명시
		if (i == 100) {
			return;
		}
		System.out.println(i + "번째 재귀 함수에서 " + (i + 1) + "번째 재귀 함수를 호출합니다.");
		recursiveFunction(i + 1);
		System.out.println(i + "번째 재귀 함수를 종료합니다.");
	}
}
