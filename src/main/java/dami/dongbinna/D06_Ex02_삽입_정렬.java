package dami.dongbinna;

public class D06_Ex02_삽입_정렬 {
	public static void main(String[] args) {
		int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

		for (int i = 0; i < array.length; i++) {
			// 인덱스 i부터 1까지 감소하여 반복
			for (int j = i; j > 0; j--) {
				// System.out.println("i=" + i + " j=" + j + " array[j-1]=" + array[j - 1] + " array[j]=" + array[j]);
				if (array[j - 1] > array[j]) {	// 한 칸씩 왼쪽으로 이동
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else {	// 자기보다 작은 데이터를 만나면 그 위치에서 멈춤
					break;
				}
			}
		}

		for (int n : array) {
			System.out.print(n + " ");
		}
	}
}
