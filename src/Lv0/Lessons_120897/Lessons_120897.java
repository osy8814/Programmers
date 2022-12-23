package Lv0.Lessons_120897;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lessons_120897 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(24)));
	}

}
class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i->n%i==0).toArray();
    }
}