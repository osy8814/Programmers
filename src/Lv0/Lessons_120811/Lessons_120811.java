package Lv0.Lessons_120811;

import java.util.Arrays;

public class Lessons_120811 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = {9, -1, 0};
		System.out.println(solution.solution(array));
		
	}

}
class Solution {
    public int solution(int[] array) {
        array = Arrays.stream(array).sorted().toArray();
    	return array[array.length/2];
    }
}