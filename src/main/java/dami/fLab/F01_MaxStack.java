package dami.fLab;

import java.util.ArrayList;
import java.util.List;

public class F01_MaxStack {
	public static void main(String[] args) {
		MaxStack stack = new MaxStack();
		stack.push(5);
		stack.push(1);
		stack.push(5);
		System.out.println(stack.top());
		System.out.println(stack.popMax());
		System.out.println(stack.top());
		System.out.println(stack.peekMax());
		System.out.println(stack.pop());
		System.out.println(stack.top());
	}

}

class MaxStack {
	List<Integer> list = new ArrayList<>();
	int listCount = 0;

	public void push(int number) {
		list.add(listCount, number);
		listCount++;
	}

	public int pop() {
		int popNumber = list.get(listCount - 1);
		list.remove(listCount - 1);
		listCount--;
		return popNumber;
	}

	public int top() {
		return list.get(listCount - 1);
	}

	public int peekMax() {
		int topNumber = 0;
		for (int num : list) {
			topNumber = Math.max(num, topNumber);
		}
		return topNumber;
	}

	public int popMax() {
		int maxNumber = -1, maxIndex = 0;
		int i = 0;
		for (int num : list) {
			if (maxNumber <= num) {
				maxNumber = num;
				maxIndex = i;
			}
			i++;
		}
		list.remove(maxIndex);
		listCount--;

		return maxNumber;
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
