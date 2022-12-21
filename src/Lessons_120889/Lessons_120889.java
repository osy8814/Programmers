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
        int MaxSides = Arrays.stream(sides).max().getAsInt();
        int OthersSum = Arrays.stream(sides).sum()-MaxSides;
        return MaxSides>=OthersSum ? 2 : 1;
    }
}