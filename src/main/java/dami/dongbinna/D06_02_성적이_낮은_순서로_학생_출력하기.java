package dami.dongbinna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
[문제]
N명의 학생 정보가 있다. 학생 정보는 학생의 이름과 학생의 성적으로 구분된다. 각 학생의 이름과 성적 정보가 주어졌을 때 성적이 낮은 순서대로 학생의 이름을 출력하는 프로그램을 작성하시오.

[입력 조건]
- 첫째 줄에 학생의 수 N이 입력된다. (1 <= N <= 100,000)
- 둘째 줄부터 N + 1번째 줄에는 학생의 이름을 나타내는 문자열 A와 학생의 성적을 나타내는 정수 B가 공백으로 구분되어 입력된다. 문자열 A의 길이와 학생의 성적은 100 이하의 자연수이다.

[출력 조건]
- 모든 학생의 이름을 성적이 낮은 순서대로 출력한다. 성적이 동일한 학생들의 순서는 자유롭게 출력해도 괜찮다.

[입력 예시]
2
홍길동 95
이순신 77

[출력 예시]
이순신 홍길동
*/
public class D06_02_성적이_낮은_순서로_학생_출력하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Student> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			list.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken())));
		}

		Collections.sort(list);

		for (Student student : list) {
			System.out.print(student.getName() + " ");
		}
	}
}

class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int compareTo(Student student) {
		return this.score - student.score;
	}

	@Override
	public String toString() {
		return "Student{" +
			"name='" + name + '\'' +
			", score=" + score +
			'}';
	}
}
