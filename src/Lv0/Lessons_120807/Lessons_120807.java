package Lv0.Lessons_120807;

public class Lessons_120807 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(2, 3));
	}

}
class Solution {
    public int solution(int num1, int num2) {
        return num1==num2 ? 1 : -1;
    }
}