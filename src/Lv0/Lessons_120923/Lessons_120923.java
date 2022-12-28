package Lv0.Lessons_120923;

import java.util.Arrays;

public class Lessons_120923 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(3, 0)));
	}

}

class Solution {
	public int[] solution(int num, int total) {
		
		int[] answer = new int[num];
		
		for (int i = total/num-num; i < total/num+num; i++) {
			
			int result = 0;
			
			for (int j = 0; j < num; j++) {
				result += i + j;
			}
			if (result == total) {
				for (int k = 0; k < num; k++) {
					answer[k] = i + k;
				}
				break;
			}
		}
		return answer;
	}
}