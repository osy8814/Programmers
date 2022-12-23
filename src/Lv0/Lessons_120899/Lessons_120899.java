package Lv0.Lessons_120899;

import java.util.Arrays;

public class Lessons_120899 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[]array= {1, 8, 3};
		System.out.println(Arrays.toString(solution.solution(array)));
	}

}
class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0, 0};
        for (int i = 0; i < array.length; i++) {
        	if(array[i]>answer[0]) {
        		answer[0]=array[i];
        		answer[1]=i;
        	}
		}
        return answer;
    }
}