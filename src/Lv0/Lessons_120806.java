package Lv0;

public class Lessons_120806 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(7, 3));
	}

}
class Solution {
    public int solution(int num1, int num2) {
        return (int)(num1/(num2*1.0)*1000);
    }
}