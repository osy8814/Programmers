package Lv0.Lessons_120876;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lessons_120876 {

	public static void main(String[] args) {
		Solution solution = new Solution();
//		int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
		int[][] lines = { { 0, 5 }, { 3, 9 }, { 1, 10 } };
		System.out.println(solution.solution(lines));
	}
}

class Solution {
	public int solution(int[][] lines) {

		int[] arr = new int[200];

		for (int i = 0; i < lines.length; i++) {
			for (int j = lines[i][0]+100; j < lines[i][1]+100; j++) {
				arr[j]++;
			}

		}
		System.out.println(Arrays.toString(arr));
		
		int clash = (int) Arrays.stream(arr).filter(x->x>=2).count();
		
		return clash;
	}
}