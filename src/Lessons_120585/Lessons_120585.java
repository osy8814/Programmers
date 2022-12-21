package Lessons_120585;

import java.util.Arrays;

public class Lessons_120585 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = { 149, 180, 192, 170 };
		int n = 167;
		System.out.println(solution.solution(array, n));
	}

}

class Solution {
	public int solution(int[] array, int n) {
		return (int) Arrays.stream(array).sorted().filter(x -> x>n).count();
	}
}