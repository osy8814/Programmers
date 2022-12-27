package Lv0.Lessons_120924;

public class Lessons_120924 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] common = { 3, 6, 9};
		System.out.println(solution.solution(common));
	}

}

class Solution {
	public int solution(int[] common) {
		if ((common[1] - common[0]) == (common[2] - common[1])) {
			return common[common.length-1] + (common[2] - common[1]);
		} else
			return common[common.length-1] * (common[2] / common[1]);
	}
}