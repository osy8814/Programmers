package Lv0.Lessons_120853;

public class Lessons_120853 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("-1 -2 -3 Z"));
	}

}


class Solution {
	public int solution(String s) {
		String[] arr = s.split(" ");
		int answer = Integer.valueOf(arr[0]);
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals("Z")) {
				answer -= Integer.valueOf(arr[i - 1]);
			}else {
				answer += Integer.valueOf(arr[i]);
			} 
		}
		return answer;
	}
}