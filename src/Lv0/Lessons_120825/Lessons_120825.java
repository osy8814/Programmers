package Lv0.Lessons_120825;

public class Lessons_120825 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("hello",3));
		
	}

}
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
    	for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < n; j++) {
				answer += my_string.charAt(i); 
			}		
		}
    	
    	return answer;
    }
}
	