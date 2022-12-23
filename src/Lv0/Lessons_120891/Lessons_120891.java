package Lv0.Lessons_120891;

import java.util.Arrays;

public class Lessons_120891 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(369));
	}

}

class Solution {
	public int solution(int order) {
		return (int) Arrays.stream(String.valueOf(order).split(""))
				.filter(x -> !x.equals("0") && Integer.parseInt(x) % 3 == 0).count();
	}
}