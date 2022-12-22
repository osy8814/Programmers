package Lv0;

import java.util.Arrays;

public class Lessons_120847 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[]numbers = {0, 31, 24, 10, 1, 9};
		System.out.println(solution.solution(numbers));
	}

}
class Solution {
    public int solution(int[]numbers) {
    	Arrays.sort(numbers);
    	return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}