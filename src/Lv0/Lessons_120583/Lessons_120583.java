package Lv0.Lessons_120583;

import java.util.Arrays;

public class Lessons_120583 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[]array= {1, 1, 2, 3, 4, 5};
		int n = 1;
		System.out.println(solution.solution(array, n));
	}

}
class Solution {
    public int solution(int[] array, int n) {
    	return (int) Arrays.stream(array).filter(x -> x==n).count();
    }
}