package Lv0.Lessons_120888;

public class Lessons_120888 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("We are the world"));
	}

}

class Solution {
	public String solution(String my_string) {
		String[] arr = my_string.split("");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].equals(arr[i])) {
					arr[j] = "";
				}
			}
		}
		return String.join("", arr);
	}
}