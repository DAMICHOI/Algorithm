package dami.programmers.level1;

import java.util.Arrays;

public class P42748_K번째수 {
	public static void main(String[] args) {
		P42748_K번째수 p = new P42748_K번째수();
		p.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
	}

	private int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			answer[i] = getNumber(array, commands[i]);
		}

		return answer;
	}

	private int getNumber(int[] array, int[] command) {
		int i = command[0];
		int j = command[1];
		int k = command[2];
		int[] temp = new int[j - i + 1];
		int answer = 0;

		for (int l = i - 1, m = 0; l < j; l++, m++) {
			temp[m] = array[l];
		}

		Arrays.sort(temp);

		for (int l = 0; l < temp.length; l++) {
			if (l == k - 1) {
				answer = temp[l];
			}
		}

		System.out.println("answer=" + answer);

		return answer;
	}
}
