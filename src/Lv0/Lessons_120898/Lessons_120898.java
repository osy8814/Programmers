package Lv0.Lessons_120898;

public class Lessons_120898 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int answer = solution.solution("happy birthday!");
		System.out.println(answer);
		
	}

}
class Solution {
    public int solution(String message) {
    	return message.length()*2;
    }
}