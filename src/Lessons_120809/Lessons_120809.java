package Lessons_120809;

import java.util.Arrays;

public class Lessons_120809 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[]numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString((solution.solution(numbers))));
		
	}

}
class Solution {
    public int[] solution(int[] numbers) {
    	for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i]*2;
		}
    	return numbers;
    }
}