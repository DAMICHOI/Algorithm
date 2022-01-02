package dami.leetcode.explore.arrays101;

public class L10_Replace_Elements_with_Greatest_Element_on_Right_Side {
	public static void main(String[] args) {
		L10_Replace_Elements_with_Greatest_Element_on_Right_Side solution = new L10_Replace_Elements_with_Greatest_Element_on_Right_Side();
		System.out.println(solution.replaceElements(new int[] {17, 18, 5, 4, 6, 1}));
		System.out.println(solution.replaceElements(new int[] {400}));
	}

	private int[] replaceElements(int[] arr) {
		if(arr.length == 0){
			return arr;
		}
		int max = -1;
		for(int i = arr.length-1; i>=0; i--){
			int temp = arr[i];
			arr[i] = max;
			if(temp > max){
				max = temp;
			}
			System.out.println(arr[i]);
		}
		return arr;
	}

	/*private int[] replaceElements(int[] arr) {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int max = i == arr.length - 1 ? -1 : arr[i + 1];
			for (int j = i + 1; j < arr.length - 1; j++) {
				int compare = Math.max(arr[j], arr[j + 1]);
				if (max < compare) {
					max = compare;
				}
			}

			result[i] = max;
		}

		return result;
	}*/
}
