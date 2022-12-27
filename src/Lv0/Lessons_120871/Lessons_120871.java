package Lv0.Lessons_120871;

public class Lessons_120871 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(40));
	}
}

class Solution {
	
	public  int Myfunction(int n) {
		n++;
		return (n%3==0 || (n+"").contains("3")) ? Myfunction(n) : n ;
	}
	public int solution(int n) {
		int threeTimes = 0;

		for (int i = 1; i <= n; i++) {
			threeTimes = Myfunction(threeTimes);
		}
		return threeTimes;
	}
}