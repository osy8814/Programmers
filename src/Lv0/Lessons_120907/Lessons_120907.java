package Lv0.Lessons_120907;

import java.util.Arrays;

public class Lessons_120907 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] quiz = { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" };
		System.out.println(Arrays.toString(solution.solution(quiz)));
	}

}

class Solution {

	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];

		for (int i = 0; i < quiz.length; i++) {
			String[] arr = quiz[i].split(" ");
			int result = Integer.valueOf(arr[0]);
			result = arr[1].equals("+") ? result + Integer.valueOf(arr[2]) : result - Integer.valueOf(arr[2]);

			answer[i] = result == Integer.valueOf(arr[4]) ? "O" : "X";
		}
		return answer;
	}
}