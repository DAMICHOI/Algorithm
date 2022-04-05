package dami.dongbinna;

public class D05_Ex05_2가지_방식으로_구현한_팩토리얼_예제 {
	public static void main(String[] args) {
		System.out.println("반복적으로 구현: " + factorialIterative(5));
		System.out.println("재귀적으로 구현: " + factorialRecursive(5));
	}

	/**
	 * 반복적으로 구현한 n! (팩토리얼)
	 * @param n
	 * @return n! 결과 값
	 */
	static int factorialIterative(int n) {
		int result = 1;

		// 1부터 n까지의 수를 차례대로 곱하기
		for (int i = 1; i < n + 1; i++) {
			result *= i;
		}
		return result;
	}

	/**
	 * 재귀적으로 구현한 n! (팩토리얼)
	 * @param n
	 * @return n! 결과 값
	 */
	static int factorialRecursive(int n) {
		// n이 1 이하인 경우 1을 반환
		if (n <= 1) {
			return 1;
		}

		// n! = n * (n-1)!를 그대로 코드로 작성하기
		return n * factorialRecursive(n - 1);
	}
}
