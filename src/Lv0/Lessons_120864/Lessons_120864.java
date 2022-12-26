package Lv0.Lessons_120864;

public class Lessons_120864 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("1a2b3c4d123Z"));
	}

}

class Solution {
	public int solution(String my_string) {
		int answer = 0;

		String[] arr = my_string.split("[a-zA-Z]+");
		for (String string : arr) {
			try {
				answer += Integer.parseInt(string);
			} catch (Exception e) {
				continue;
			}
		}
		return answer;
	}
}