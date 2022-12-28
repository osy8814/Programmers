package Lv0.Lessons_120880;

import java.util.Arrays;
import java.util.Comparator;

public class Lessons_120880 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numlist = {1, 2, 3, 4, 5, 6};	
		int n = 4;
		System.out.println(Arrays.toString(solution.solution(numlist, n)));
	}

}


class Solution{
	
	public int[] solution(int[] numlist, int n) {
        				
    	return Arrays.stream(numlist)
        		.boxed()
        		.sorted(Comparator.reverseOrder())
        		.sorted((o1, o2) -> Math.abs(o1-n) - Math.abs(o2-n))
        		.mapToInt(Integer::intValue)
        		.toArray();
    }
}