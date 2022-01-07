package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class I02_06_뒤집은_소수 {
	// 내가 푼 문제 (속도 91ms/메모리 26MB)
	/*public static void main(String[] args) throws IOException {
		I02_06_뒤집은_소수 solution = new I02_06_뒤집은_소수();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; st.hasMoreTokens(); i++) {
			solution.reversePrime(st.nextToken());
		}
	}

	private void reversePrime(String number) {
		int result = 0;
		StringBuilder sb = new StringBuilder();
		int reverseNumber = 0;

		for (int i = number.length() - 1; i >= 0; i--) {
			sb.append(number.charAt(i));
		}
		reverseNumber = Integer.parseInt(sb.toString());
		result = reverseNumber;

		if (reverseNumber == 0 || reverseNumber == 1) {
			result = 0;
		}

		for (int i = 2; i < result; i++) {
			if (reverseNumber % i == 0) {
				result = 0;
				break;
			}
		}

		System.out.print(result != 0 ? result + " " : "");
	}*/

	// 내가 푼 문제2 (속도 91ms/메모리 26MB)
	public static void main(String[] args) throws IOException {
		I02_06_뒤집은_소수 solution = new I02_06_뒤집은_소수();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		while (st.hasMoreTokens()) {
			System.out.print(solution.reversePrime(Integer.parseInt(st.nextToken())));
		}

	}

	private String reversePrime(int number) {

		int temp = number;
		int res = 0;

		while (temp > 0) {
			int t = temp % 10;
			res = res * 10 + t;
			temp /= 10;
		}

		if (isPrime(res)) {
			return String.valueOf(res) + " ";
		}

		return "";
	}

	private boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	// 강사님 문제 풀이 (속도 136ms/메모리 28MB)
	/*public static void main(String[] args) {
		I02_06_뒤집은_소수 t = new I02_06_뒤집은_소수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		for (int x : t.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

	private ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;
			while (tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp /= 10;
			}
			if (isPrime(res))
				answer.add(res);
		}
		return answer;
	}

	private boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}*/
}
