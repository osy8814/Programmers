package Lv0.Lessons_120884;

public class Lessons_120884 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(1081));

	}

}

class Solution {
	public int solution(int chicken) {

		if (chicken / 10 < 1) {
			return 0;
		} else {
			return chicken / 10 + solution(chicken / 10 + chicken % 10);
		}
	}
}