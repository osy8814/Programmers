package Lv0;

public class Lessons_120908 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int answer = solution.solution("ab6CDE443fgh22iJKlmn1o", "6CD");
		System.out.println(answer);
		
	}

}
class Solution {
    public int solution(String str1, String str2) {
    	int answer = 0;
        boolean result = str1.contains(str2);
        return result ? 1 : 2;
    }
}