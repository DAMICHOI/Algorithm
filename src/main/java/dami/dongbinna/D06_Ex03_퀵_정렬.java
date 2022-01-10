package dami.dongbinna;

public class D06_Ex03_퀵_정렬 {
	public static void main(String[] args) {
		D06_Ex03_퀵_정렬 solution = new D06_Ex03_퀵_정렬();
		int[] array = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

		solution.quickSort(array, 0, array.length - 1);
		for (int x : array) {
			System.out.println(x);
		}
	}

	private void quickSort(int[] array, int start, int end) {
		if (start >= end) {
			return;
		}

		int pivot = start;
		int left = start + 1;
		int right = end;

		while (left <= right) {
			// 피벗보다 큰 데이터를 찾을 때까지 반복
			while (left <= end && array[left] <= array[pivot]) {
				left++;
			}

			//피벗보다 작은 데이터를 찾을 때까지 반복
			while (right > start && array[right] >= array[pivot]) {
				right--;
			}

			if (left > right) {
				int temp = array[right];
				array[right] = array[pivot];
				array[pivot] = temp;
			} else {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		}

		quickSort(array, start, right - 1);
		quickSort(array, right + 1, end);
	}
}
