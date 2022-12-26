package Lv0.Lessons_120890;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lessons_120890 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = { 10, 11, 12 };
		int n = 13;
		System.out.println(solution.solution(array, n));
	}

}

//class Solution {
//	public int solution(int[] array, int n) {
//
//		List<Integer> closestNumbers = new ArrayList<>();
//
//		int gap = 100;
//		
//		for (int i = 0; i < array.length; i++) {
//			if (Math.abs(array[i] - n) < gap) {
//				gap = Math.abs(array[i] - n);
//			}
//		}
//		
//		for (int i = 0; i < array.length; i++) {
//			if(Math.abs(array[i] - n) == gap) {
//				closestNumbers.add(array[i]);
//			}
//		}
//		
//		Collections.sort(closestNumbers);
//		
//		return closestNumbers.get(0);
//	}
//}

class Solution {
	public int solution(int[] array, int n) {

		int answer = 0;
		
		Arrays.sort(array);

		int gap = 100;
		
		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i] - n) < gap) {
				gap = Math.abs(array[i] - n);
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if(Math.abs(array[i] - n) == gap) {
				answer = array[i];
				break;
			}
		}
		return answer;
	}
}