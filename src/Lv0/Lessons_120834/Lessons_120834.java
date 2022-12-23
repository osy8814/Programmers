package Lv0.Lessons_120834;

public class Lessons_120834 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(23));
	}

}

class Solution {
	public String solution(int age) {
    	String answer = "";
        String age962 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");
        
        for (int i = 0; i < ageArr.length; i++) {
        	answer += age962.charAt(Integer.valueOf(ageArr[i]));
		}
        return answer;
    }
}