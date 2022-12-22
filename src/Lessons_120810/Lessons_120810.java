package Lessons_120810;

public class Lessons_120810 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(10, 5));
	}

}
class Solution {
    public int solution(int num1, int num2) {
        return num1%num2;
    }
}
