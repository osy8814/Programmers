package Lv0.Lessons_120851;

import java.util.Arrays;
import java.util.Iterator;

public class Lessons_120851 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("aAb1B2cC34oOp"));
	}

}
class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
                
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
			answer += Integer.valueOf(arr[i]); 
		}
        return answer;
    }
}