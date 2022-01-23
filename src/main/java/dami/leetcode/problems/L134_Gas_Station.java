package dami.leetcode.problems;

public class L134_Gas_Station {
	public static void main(String[] args) {
		L134_Gas_Station solution = new L134_Gas_Station();
		System.out.println(solution.canCompleteCircuit(new int[] {1, 2, 3, 4, 5}, new int[] {3, 4, 5, 1, 2}));
	}

	// One Pass - 시간 복잡도: O(n), 공간 복잡도: O(1) / Runtime: 4ms, Memory: 63.4MB
	private int canCompleteCircuit(int[] gas, int[] cost) {
		int total = 0, tank = 0, start = 0;
		for (int i = 0; i < gas.length; i++) {
			tank += gas[i] - cost[i];
			total += gas[i] - cost[i];
			if (tank < 0) {
				start = i + 1;
				tank = 0;
			}
		}

		return total >= 0 ? start : -1;
	}

	// Brute Force2 - 시간 복잡도: O(n), 공간 복잡도: O(1) / Runtime: 1ms, Memory: 60.1MB
	/*private int canCompleteCircuit(int[] gas, int[] cost) {
		int total = 0;

		for (int i = 0; i < gas.length; i++) {
			total += gas[i] - cost[i];
		}

		if (total < 0)
			return -1;
		int tank = 0, start = 0;

		for (int i = 0; i < gas.length; i++) {
			tank += gas[i] - cost[i];
			if (tank < 0) {
				start = i + 1;
				tank = 0;
			}
		}

		return tank >= 0 ? start : -1;
	}*/

	// Brute Force - 시간 복잡도 : O(n^2), 공간 복잡도: O(n) / Time Limit Exceeded
	/*private int canCompleteCircuit(int[] gas, int[] cost) {
		for (int i = 0; i < gas.length; i++) {
			int tank = 0;
			boolean roundTrip = true;
			for (int j = i; j < gas.length + i + 1; j++) {
				tank += gas[j % gas.length] - cost[j % gas.length];
				if (tank < 0) {
					roundTrip = false;
					break;
				}
			}
			if (roundTrip) {
				return i;
			}
		}
		return -1;
	}*/
}
