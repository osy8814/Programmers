package Lv0.Lessons_120892;

public class Lessons_120892 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("pfqallllabwaoclk",2));
	}

}
class Solution {
    public String solution(String cipher, int code) {
        String answer ="";
    	for (int i = code-1; i < cipher.length(); i+=code) {
			answer += cipher.charAt(i);
		}
    	return answer;
    }
}