package dami.codingtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Given an integer k and a list of integers, count the number of distinct valid pairs of integers (a, b) in the list for which a + k = b. Two pairs of integers (a, b) and (c, d) are considered distinct if at least one element of (a, b) does not also belong to (c, d). Note that the elements in a pair might be the same element in the array. An instance of this is below where k = 0.

Example
n = 4
Numbers = [1, 1, 1, 2]
K = 1

This array has three different valid pairs: (1, 1) and (1, 2) and (2, 2). For k = 1,  there is only 1 valid pair which satisfies a + k = b; the pair (a, b) = (1, 2).

n = 2
Numbers = [1, 2]
K = 0

There are three valid pairs: (1, 1), (2, 2) and (1, 2). For k = 0, two valid pairs satisfy a + k = b: 1 + 0 = 1 and 2 + 0 = 2.

Function Description
Complete the function countPairs in the editor below.

countPairs has the following parameter(s):
  Int numbers[n]: array of integers
  Int k: target difference
Returns
  int: number of valid (a, b) pairs in the numbers array that have a difference of k

Constraints
* 2 <= n < 2 * 10^5
* 0 <= numbers[I] <= 10^9, where 0 <= i < n
* 0 <= k <= 10^9
* */

public class CountingPair {
	public static void main(String[] args) {
		CountingPair countingPair = new CountingPair();

		System.out.println(countingPair.solution(new int[] {1, 1, 1, 2}, 1));	// result = 1
		System.out.println(countingPair.solution(new int[] {1, 1, 1, 2}, 0));	// result = 2
		System.out.println(countingPair.solution(new int[] {1, 2, 3, 4, 5, 6}, 3));	// result = 3
	}

	private int solution(int[] number, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;

		// 중복되지 않은 숫자 추가
		for (int i = 0; i < number.length; i++) {
			// list 에 포함되지 않은 값일 경우
			if (!list.contains(number[i])) {
				list.add(number[i]);    // list에 추가
				map.put(number[i] - k, number[i]);    // 현재 수의 보수 값을 key로 하고 현재 수를 value로 하는 데이터 삽입
			}
		}

		// System.out.println("list=" + list);
		// System.out.println("map=" + map);

		for (int i = 0; i < list.size(); i++) {
			// 현재 수(list.get(i))의 보수가 있는지 확인
			if (map.containsKey(list.get(i))) {
				// 있을 경우, count + 1
				// System.out.println("contains mapValue=" + map.get(list.get(i)) + " listValue=" + list.get(i));
				count++;
			}
		}

		return count;
	}

	/*
	private int solution2(int[] number, int k) {
		ArrayList<Pair> list = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				Pair pair = new Pair(number[i], number[j]);
				// list에 포함되어 있지 않고, a + k = b 인 경우
				if (!list.contains(pair) && pair.valid(k)) {
					list.add(pair);
					count++;
					System.out.println(list);
				}
			}
		}

		return count;
	}
	*/
}

/*
class Pair {
	int a;
	int b;

	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public boolean valid(int k) {
		return this.a + k == this.b;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Pair pair = (Pair)o;
		return (a == pair.a && b == pair.b) || (a == pair.b && b == pair.a);
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}

	@Override
	public String toString() {
		return "Pair{" +
			"a=" + a +
			", b=" + b +
			'}';
	}
}
*/
