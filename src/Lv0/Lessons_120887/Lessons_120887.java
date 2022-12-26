package Lv0.Lessons_120887;

public class Lessons_120887 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(1,13,1));

	}

}

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <= j; l++) {
			int originalLength = (l+"").length();
			int replacedLength = (l+"").replaceAll(k+"", "").length();
			answer += originalLength - replacedLength;
		}
    	return answer; 
    }
}