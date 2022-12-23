package Lv0.Lessons_120844;

import java.util.Arrays;

public class Lessons_120844 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		System.out.println(Arrays.toString(solution.solution(numbers, direction)));
	}

}

class Solution {
	public int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		if (direction.equals("right")) {
			answer[0]=numbers[numbers.length-1];
			System.arraycopy(numbers, 0, answer, 1, numbers.length-1);
			
		} else {
			answer[numbers.length-1]=numbers[0];
			System.arraycopy(numbers, 1, answer, 0, numbers.length-1);
			
		}
		return answer;
	}
}