package Lv0.Lessons_120910;

public class Lessons_120910 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(7,15));
	}

}
class Solution {
    public int solution(int n, int t) {
        return n*(int)Math.pow(2, t);
    }
}