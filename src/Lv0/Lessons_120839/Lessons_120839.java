package Lv0.Lessons_120839;

public class Lessons_120839 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("205"));
	}

}
class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
			answer += rsp.charAt(i)=='2' ? "0" : rsp.charAt(i)=='0' ? "5" : "2";   
		}
        return answer;
    }
}