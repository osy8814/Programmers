package Lv0.Lessons_120850;

import java.util.Arrays;

public class Lessons_120850 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution("hi12392")));
	}

}
class Solution {
    public int[] solution(String my_string) {
    	my_string = my_string.replaceAll("[a-z]", ""); 
        
    	String[] arr = my_string.split("");
        int[]answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
        	answer[i] = Integer.parseInt(arr[i]);
		}
        Arrays.sort(answer);
        
    	return answer;
    }
}