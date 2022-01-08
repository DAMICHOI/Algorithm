package dami.dongbinna;

public class D06_Ex01_선택_정렬 {
	public static void main(String[] args) {
		int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

		for (int i = 0; i < array.length; i++) {
			int minIndex = i;    // 가장 작은 원소의 인덱스
			int temp;
			for (int j = i + 1; j < array.length; j++) {
				// System.out.println(
				// 	"minIndex=" + minIndex + " j=" + j + " array[minIndex]=" + array[minIndex] + " array[j]="
				// 		+ array[j]);
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
				// 스와프
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}

		for (int n : array) {
			System.out.print(n + " ");
		}
	}
}
