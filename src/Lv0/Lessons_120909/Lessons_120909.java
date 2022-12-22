package Lv0.Lessons_120909;

public class Lessons_120909 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(946));

	}

}
class Solution {
    public int solution(int n) {
        return Math.sqrt(n)%(int)Math.sqrt(n)==0 ? 1 : 2;
    }
}
