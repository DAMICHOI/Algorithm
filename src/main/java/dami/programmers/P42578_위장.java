package dami.programmers;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P42578_위장 {
	public static void main(String[] args) {
		P42578_위장 solution = new P42578_위장();
		// headgear => yellowhat, green_turban
		// eyewear => bluesunglasses
		// yellowhat
		// green_turban
		// bluesunglasses
		// yellowhat + bluesunglasses
		// green_turban + bluesunglasses
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution.otherCombine(clothes));

		// face => crowmask, bluesunglasses, smoky_makeup
		// crowmask
		// bluesunglasses
		// smoky_makeup
		clothes = new String[][] {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
		System.out.println(solution.otherCombine(clothes));
	}

	private int otherCombine(String[][] clothes) {
		return Arrays.stream(clothes)
			.collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
			.values()
			.stream()
			.collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
	}

	// private int otherCombine(String[][] clothes) {
	// 	int answer = 1;
	// 	Map<String, Integer> clothesMap = new HashMap<>();
	//
	// 	for (String[] clothe : clothes) {
	// 		clothesMap.put(clothe[1], clothesMap.getOrDefault(clothe[1], 0) + 1);
	// 	}
	//
	// 	for (String key : clothesMap.keySet()) {
	// 		answer *= (clothesMap.get(key) + 1);
	// 	}
	// 	--answer;
	//
	// 	return answer;
	// }
}
