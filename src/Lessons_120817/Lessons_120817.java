package Lessons_120817;

import java.util.Arrays;

public class Lessons_120817 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[]numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(solution.solution(numbers));
	}

}
class Solution {
    public double solution(int[] numbers) {
    	return Arrays.stream(numbers).average().getAsDouble();
    }
}