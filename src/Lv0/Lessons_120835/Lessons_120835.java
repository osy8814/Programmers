package Lv0.Lessons_120835;

import java.util.Arrays;
import java.util.Collections;

public class Lessons_120835 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] emergency = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(solution.solution(emergency)));

	}

}

class Solution {
	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		int[] sortEmergency = Arrays.stream(emergency).boxed().sorted(Collections.reverseOrder())
				.mapToInt(Integer::valueOf).toArray();
		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (sortEmergency[i] == emergency[j]) {
					answer[j] = i+1;
				}
			}
		}
		return answer;
	}
}