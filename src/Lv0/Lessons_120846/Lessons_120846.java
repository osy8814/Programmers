package Lv0.Lessons_120846;

public class Lessons_120846 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(15));
	}

}

class Solution {
	public int solution(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int flag = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					flag++;
				}
			}
			if (flag >= 3) {
				count++;
			}
		}
		return count;
	}
}