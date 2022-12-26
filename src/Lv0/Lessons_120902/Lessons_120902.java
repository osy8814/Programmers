package Lv0.Lessons_120902;

public class Lessons_120902 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("3 + 4 - 1 + 9"));
	}

}

class Solution {
	public int solution(String my_string) {
		String[] arr = my_string.split(" ");
		int answer = Integer.valueOf(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals("+")) {
				answer += Integer.valueOf(arr[i + 1]);
			} else if (arr[i].equals("-")) {
				answer -= Integer.valueOf(arr[i + 1]);
			}else {
				continue;
			}
		}
		return answer;
	}
}