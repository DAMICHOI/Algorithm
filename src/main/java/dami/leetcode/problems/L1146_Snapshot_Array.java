package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class L1146_Snapshot_Array {
	public static void main(String[] args) {
		System.out.println("===============exam 1===============");
		SnapshotArray snapArr = new SnapshotArray(3);
		snapArr.set(0, 5);
		int snap = snapArr.snap();
		System.out.println(snap);
		snapArr.set(0, 6);
		snap = snapArr.snap();
		System.out.println(snap);
		System.out.println(snapArr.get(0, 0));
		System.out.println(snapArr.get(0, 1));

		System.out.println();
		System.out.println("===============exam 2===============");
		snapArr = new SnapshotArray(3);
		snapArr.set(0, 5);
		snap = snapArr.snap();
		System.out.println(snap);
		snapArr.set(0, 6);
		System.out.println(snapArr.get(0, 0));

	}

	private static class SnapshotArray {
		TreeMap<Integer, Integer>[] map;
		int curSnap;

		public SnapshotArray(int length) {
			curSnap = 0;
			map = new TreeMap[length];
			for (int i = 0; i < length; i++) {
				map[i] = new TreeMap<>();
				map[i].put(0, 0);
			}
		}

		// O(log(n))
		public void set(int index, int val) {
			map[index].put(curSnap, val);
		}

		// O(1)
		public int snap() {
			return curSnap++;
		}

		// O(log(n))
		public int get(int index, int snap_id) {
			return map[index].floorEntry(snap_id).getValue();
		}
	}

	/*static class SnapshotArray {
		private List<Map<Integer, Integer>> snapshot;
		private Map<Integer, Integer> map;

		public SnapshotArray(int length) {
			this.snapshot = new ArrayList<>();
			this.map = new HashMap<>();
		}

		// O(1)
		public void set(int index, int val) {
			this.map.put(index, val);
		}

		// O(1)
		public int snap() {
			this.snapshot.add(this.map);
			this.map = new HashMap<>();
			return this.snapshot.size() - 1;
		}

		// O(n)
		public int get(int index, int snapId) {
			for (int i = snapId; i >= 0; --i) {
				if (this.snapshot.get(i).containsKey(index)) {
					return this.snapshot.get(i).get(index);
				}
			}
			return 0;
		}
	}*/

	/*static class SnapshotArray {
		int snapCount;
		HashMap<Integer, Integer> map;
		HashMap<Integer, HashMap<Integer, Integer>> snapshotMap;

		public SnapshotArray(int length) {
			this.snapCount = 0;
			this.map = new HashMap<>();
			this.snapshotMap = new HashMap<>();
		}

		public void set(int index, int val) {
			this.map.put(index, val);
		}

		public int snap() {
			this.snapshotMap.put(this.snapCount, new HashMap<>(this.map));
			return this.snapCount++;
		}

		public int get(int index, int snapId) {
			if (!this.snapshotMap.containsKey(snapId)) {
				return -1;
			}

			HashMap<Integer, Integer> inner = this.snapshotMap.get(snapId);

			if (!inner.containsKey(index)) {
				return 0;
			}

			return inner.get(index);
		}

		@Override
		public String toString() {
			return "SnapshotArray{" +
				"snapCount=" + snapCount +
				", map=" + map +
				", snapshotMap=" + snapshotMap +
				'}';
		}
	}*/
}
