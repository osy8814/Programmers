package Lv0.Lessons_120905;

import java.util.Arrays;

public class Lessons_120905 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numlist = {1, 9, 3, 10, 13, 5};
		System.out.println(Arrays.toString(solution.solution(5,numlist)));
	}

}
class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(x->x%n==0).toArray();
    }
}