package Lessons_120821;

import java.util.Arrays;

public class Lessons_120821 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] num_list = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(solution.solution(num_list)));
	}

}

class Solution {
	public int[] solution(int[] num_list) {
		int[] newArr = new int[num_list.length];
		for (int i = 0; i < num_list.length; i++) {
			newArr[i] = num_list[num_list.length - 1 - i];
		}
		return newArr;
	}
}