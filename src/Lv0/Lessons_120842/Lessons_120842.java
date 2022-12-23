package Lv0.Lessons_120842;

import java.util.Arrays;

public class Lessons_120842 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(1, 2, 1, 2)));

	}

}

class Solution {
	public int[] solution(int denum1, int num1, int denum2, int num2) {

		int[] answer = new int[2];

		answer[0] = denum1 * num2 + denum2 * num1;
		answer[1] = num1 * num2;
				
		int min = Math.min(answer[0], answer[1]);

		for (int i = min; i >= 1; i--) {
			if (answer[0] % i == 0 && answer[1] % i == 0) {
				
				answer[0] = answer[0] / i;
				answer[1] = answer[1] / i;
				break;
			}
		}
		return answer;
	}
}