package Lv0.Lessons_120875;

import java.util.ArrayList;
import java.util.List;

public class Lessons_120875 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
		System.out.println(solution.solution(dots));
	}
}

class Solution {
	public int solution(int[][] dots) {
		int answer = 0;

		List<Double> slopes = new ArrayList<>();

		for (int i = 0; i < dots.length - 1; i++) {
			for (int j = i+1; j < dots.length; j++) {

				double sideX = dots[i][1] - dots[j][1];
				double sideY = dots[i][0] - dots[j][0];

				double slop = sideY / sideX;

				if (!slopes.contains(slop)) {
					slopes.add(slop);
				} else {
					answer = 1;
					break;
				}
			}
			if(answer==1) {
				break;
			}
		}
		return answer;
	}
}