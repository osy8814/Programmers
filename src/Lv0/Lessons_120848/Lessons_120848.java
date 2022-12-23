package Lv0.Lessons_120848;

public class Lessons_120848 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(7));
	}

}

class Solution {
	
	public int factorial(int num) {
		if (num <= 1) {
			return num;
		} else {
			return num * factorial(num - 1);
		}
	}

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= 10; i++) {
			if (factorial(i) == n) {
				answer = i;
				break;
			} else if (factorial(i) > n) {
				answer = i-1;
				break;
			}
		}
		return answer;
	}
}