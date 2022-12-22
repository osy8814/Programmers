package Lv0.Lessons_120814;

public class Lessons_120814 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(12));
	}

}
class Solution {
    public int solution(int n) {
    	return (int) Math.ceil(n/7.0);
    }
}