package Lv0;

import java.util.Arrays;

public class Lessons_120824 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] num_list = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(solution.solution(num_list)));
	}

}

class Solution {
	public int[] solution(int[] num_list) {
		int[] result = { 0, 0 };
		for (int i : num_list) {
			if (i % 2 == 0) {
				result[0]++;
			} else {
				result[1]++;
			}
		}
		return result;
	}
}