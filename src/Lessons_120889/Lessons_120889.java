package Lessons_120889;

import java.util.Arrays;

public class Lessons_120889 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[]sides= {1, 2, 3};
		System.out.println(solution.solution(sides));
	}

}
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2]>=sides[0]+sides[1] ? 2 : 1;
    }
}