package dami.algorithm;

/**
 * <h1>Array (배열)</h1>
 * 메모리 상에 원소를 연속하게 배치한 자료 구조
 *
 * <ol><b>배열의 성질</b>
 * <li>O(1)에 k번째 원소를 확인/변경 가능</li>
 * <li>추가적으로 소모되는 메모리의 양(=overhead)가 거의 없음</li>
 * <li>Cache hit rate가 높음</li>
 * <li>메모리 상에 연속한 구간을 잡아야 해서 할당에 제약이 걸림</li>
 * </ol>
 *
 * <ol><b>기능</b>
 * <li>임의의 위치에 있는 원소를 확인 / 변경 = O(1)</li>
 * <li>원소를 끝에 추가 = O(1)</li>
 * <li>마지막 원소를 제거 = O(1)</li>
 * <li>임의의 위치에 원소를 추가/제거 = O(N)</li>
 * </ol>
 */
public class Array {
	public static void main(String[] args) {
		Array array = new Array();

		int arr[] = new int[10];
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 40;
		arr[3] = 30;
		arr[4] = 70;
		arr[5] = 20;

		array.insert(3, 60, arr);
		array.printArray(arr);
		array.erase(4, arr);
		array.printArray(arr);
	}

	void insert(int idx, int num, int arr[]) {
		for (int i = arr.length-1; i > idx ; i--) {
			arr[i] = arr[i-1];
		}

		arr[idx] = num;
	}

	void erase (int idx, int arr[]) {
		for (int i = idx; i < arr.length; i++) {
			if (i == arr.length-1) {
				arr[i] = 0;
				break;
			}
			arr[i] = arr[i+1];
		}
	}

	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
