public class Lesssons_120849 {
	
	
	public static void main(String[] args) {
		
		Solution solution = new Solution();
		String answer = solution.solution("nice to meet you");
		System.out.println(answer);
		
	}

}

class Solution {
	public String solution(String my_string) {
		return my_string.replaceAll("[aeiou]", "");
		
	}
}