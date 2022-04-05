package dami.dongbinna;

import java.util.ArrayDeque;
import java.util.Deque;

public class D05_Ex01_스택_예제 {
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<>();

		// 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
		stack.push(5);
		stack.push(2);
		stack.push(3);
		stack.push(7);
		stack.pop();
		stack.push(1);
		stack.push(4);
		stack.pop();

		// 스택의 최상단 원소부터 출력
		// 실행 결과 : 1 3 2 5
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
