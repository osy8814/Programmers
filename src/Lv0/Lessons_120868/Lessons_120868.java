package Lv0.Lessons_120868;

import java.util.ArrayList;
import java.util.List;

public class Lessons_120868 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] sides = { 3, 3 };
		System.out.println(solution.solution(sides));
	}

}

class Solution {
	public int solution(int[] sides) {
		
		if (sides[0]==sides[1]) {
			return sides[0]+sides[1]-1;
		}
		
		int longer = Math.max(sides[0], sides[1]);
		int shorter = Math.min(sides[0], sides[1]);

		List<Integer> otherSide = new ArrayList<>();
		List<Integer> longeestSide = new ArrayList<>();

		for (int i = 1; i < longer; i++) {
			if (shorter + i >= longer) {
				otherSide.add(i);
			}
		}

		for (int i = longer + 1; i < longer + shorter; i++) {
			longeestSide.add(i);

		}
		System.out.println(otherSide);
		System.out.println(longeestSide);
		return otherSide.size() + longeestSide.size();
	}
}