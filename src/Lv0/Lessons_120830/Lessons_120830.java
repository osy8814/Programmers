package Lv0.Lessons_120830;

public class Lessons_120830 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(10, 3));
	}

}
class Solution {
    public int solution(int n, int k) {
    	return n*12000+(k-(n/10))*2000;
    }
}