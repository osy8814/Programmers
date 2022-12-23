package Lv0.Lessons_120815;

public class Lessons_120815 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(4));
	}

}

class Solution {
	public int solution(int n) {
		int answer = 0;
		
		for (int i = 1; i <= 6 * n; i++) {
		
			if (6 * i % n == 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}