package Lv0.Lessons_120826;

public class Lessons_120826 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("BCBdbe","B"));
		
	}

}
class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}