package Lv0.Lessons_120833;

import java.util.Arrays;

public class Lessons_120833 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		System.out.println(Arrays.toString(solution.solution(numbers, num1, num2)));
		
	}

}
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
    	return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}