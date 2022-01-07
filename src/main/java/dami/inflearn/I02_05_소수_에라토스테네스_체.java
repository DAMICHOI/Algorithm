package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class I02_05_소수_에라토스테네스_체 {
	// 내가 푼 문제 (속도 107ms/메모리 27MB)
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int[] prime = new int[n + 1];
		prime[0] = prime[1] = 0;	// 0과 1은 소수가 아니므로 0

		// 2부터 소수를 구하고자 하는 구간의 모든 수 나열
		for (int i = 2; i < n; i++) {
			prime[i] = i;
		}

		for (int i = 2; i < n; i++) {
			// 소수가 아닐 경우 continue
			if (prime[i] == 0) {
				continue;
			}
			// 소수의 배수는 소수를 약수로 가지므로 0
			for (int j = 2 * i; j <= n; j += i) {
				prime[j] = 0;
			}
		}

		// 소수 개수 구하기
		for (int i = 0; i < n; i++) {
			if (prime[i] != 0) {
				count++;
			}
		}

		System.out.println(count);
	}*/

	// 내가 푼 문제2 (속도 93ms/메모리 27MB)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int[] prime = new int[n + 1];

		for (int i = 2; i < n; i++) {
			if (prime[i] == 0) {
				count++;
				for (int j = i; j <= n; j += i) {
					prime[j] = 1;
				}
			}
		}
		System.out.println(count);
	}

	// 강사님 문제 풀이 (속도 119ms/메모리 28MB)
	/*public static void main(String[] args) {
		I02_05_소수_에라토스테네스_체 t = new I02_05_소수_에라토스테네스_체();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(t.solution(n));
	}

	private int solution(int n) {
		int answer = 0;
		int[] ch = new int[n + 1];
		for (int i = 2; i < n; i++) {
			if (ch[i] == 0) {
				answer++;
				for (int j = i; j <= n; j += i) {
					ch[j] = 1;
				}
			}
		}
		return answer;
	}*/
}
