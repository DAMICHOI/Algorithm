package dami.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class L860_Lemonade_Change {
	public static void main(String[] args) {
		L860_Lemonade_Change solution = new L860_Lemonade_Change();
		System.out.println(solution.lemonadeChage(new int[] {5, 5, 5, 10, 20}));
		System.out.println(solution.lemonadeChage(new int[] {5, 5, 10, 10, 20}));
	}

	private boolean lemonadeChage(int[] bills) {
		if (bills[0] != 5) {
			return false;
		}
		Map<Integer, Integer> change = new HashMap<>();
		change.put(5, 0);
		change.put(10, 0);

		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				change.put(bills[i], change.getOrDefault(bills[i], 0) + 1);
			} else if (bills[i] == 10) {
				if (change.get(5) < 1) {
					return false;
				} else {
					change.put(5, change.get(5) - 1);
					change.put(bills[i], change.getOrDefault(bills[i], 0) + 1);
				}
			} else {
				if (change.get(5) > 0 && change.get(10) > 0) {
					change.put(5, change.get(5) - 1);
					change.put(10, change.get(10) - 1);
				} else if (change.get(10) == 0 && change.get(5) > 2) {
					change.put(5, change.get(5) - 3);
				} else {
					return false;
				}
			}
		}
		return true;
	}

	// private boolean lemonadeChage(int[] bills) {
	// 	if (bills[0] != 5) {
	// 		return false;
	// 	}
	//
	// 	int fives = 0, tens = 0;
	//
	// 	for (int i = 0; i < bills.length; i++) {
	// 		if (bills[i] == 5) {
	// 			fives++;
	// 		} else if (bills[i] == 10) {
	// 			if (fives > 0) {
	// 				fives--;
	// 				tens++;
	// 			} else {
	// 				return false;
	// 			}
	// 		} else {
	// 			if (fives > 0 && tens > 0) {
	// 				tens--;
	// 				fives--;
	// 			} else if (fives >= 3) {
	// 				fives -= 3;
	// 			} else {
	// 				return false;
	// 			}
	// 		}
	// 	}
	// 	return true;
	// }
}
