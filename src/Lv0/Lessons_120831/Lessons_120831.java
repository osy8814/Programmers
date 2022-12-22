package Lv0.Lessons_120831;

public class Lessons_120831 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(10));
	}

}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
			answer = i%2==0 ? answer+=i : answer; 
        }
        return answer;
    }
}