package Lv0.Lessons_120843;

public class Lessons_120843 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int k = 5;
		System.out.println(solution.solution(numbers, k));
	}

}

//class Solution {
//	public int solution(int[] numbers, int k) {
//		if ((k - 1) * 2 <= numbers.length) {
//			return numbers[(k - 1) * 2];
//		}
//		return numbers[((k - 1) * 2) % numbers.length];
//	}
//}

class Solution {
	public int solution(int[] numbers, int k) {

		return ((k - 1) * 2) % numbers.length + 1;
	}
}