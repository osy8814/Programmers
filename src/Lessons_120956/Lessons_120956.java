package Lessons_120956;

public class Lessons_120956 {

	public static void main(String[] args) {
		Solution solution = new Solution();
//		String[]babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		String[]babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		int answer = solution.solution(babbling);
		System.out.println(answer);
		
	}

}
class Solution {
    public int solution(String[] babbling) {
    	int answer = 0;
    	for (String string : babbling) {
    		string = string.replaceAll("(aya)|(ye)|(woo)|(ma)", "");
    		answer = string.equals("") ? answer += 1 : answer ;    
    	}
        return answer;
    }
}