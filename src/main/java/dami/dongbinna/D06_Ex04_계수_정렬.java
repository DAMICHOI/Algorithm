package dami.dongbinna;

public class D06_Ex04_계수_정렬 {
	public static void main(String[] args) {
		int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
		int[] count = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			count[array[i]]++;
		}

		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}
}
