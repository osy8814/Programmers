package Lv0.Lessons_120861;

import java.util.Arrays;

public class Lessons_120861 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] keyinput = { "left", "right", "up", "right", "right" };
		int[] board = { 11, 11 };
		System.out.println(Arrays.toString(solution.solution(keyinput, board)));
	}

}

class Solution {
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = { 0, 0 };
		for (int i = 0; i < keyinput.length; i++) {
			if (keyinput[i].equals("up") && answer[1] < board[1] / 2) {
				answer[1] += 1;
			} else if (keyinput[i].equals("down") && answer[1] > -board[1] / 2) {
				answer[1] -= 1;
			} else if (keyinput[i].equals("right") && answer[0] < board[0] / 2) {
				answer[0] += 1;
			} else if (keyinput[i].equals("left") && answer[0] > -board[0] / 2) {
				answer[0] -= 1;
			}
			
		}
		return answer;
	}
}
