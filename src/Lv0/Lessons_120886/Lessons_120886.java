package Lv0.Lessons_120886;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Lessons_120886 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("allpe", "apple"));
	}

}

class Solution {
	public int solution(String before, String after) {
	
		before = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
		after = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());

		return before.equals(after) ? 1 : 0;
	}
}