package Lv0.Lessons_120896;

import java.util.Arrays;

public class Lessons_120896 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("hello"));

	}

}

class Solution {
	public String solution(String s) {
		String answer = "";

		String[] arr = Arrays.stream(s.split("")).distinct().sorted().toArray(String[]::new);
		
		for (int i = 0; i < arr.length; i++) {
			String a = arr[i];
			int duplication = (int) Arrays.stream(s.split("")).filter(x -> x.equals(a)).count();

			if (duplication == 1) {
				answer += a;
			}
		}
		return answer;
	}
}