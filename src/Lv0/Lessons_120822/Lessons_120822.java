package Lv0.Lessons_120822;

public class Lessons_120822 {

	public static void main(String[] args) {
//		Solution1 solution = new Solution1();
		Solution2 solution = new Solution2();
		System.out.println(solution.solution("jaron"));
	}

}
class Solution1 {
    public String solution(String my_string) {
    	String[]strs = my_string.split("");
    	String answer = "";
    	for (int i = strs.length-1; i >=0 ; i--) {
			answer += strs[i];
		}
    	return answer;
    }
}

class Solution2 {
    public String solution(String my_string) {
    	StringBuffer sb = new StringBuffer(my_string);
    	sb.reverse();
    	
    	return sb.toString();
    }
}