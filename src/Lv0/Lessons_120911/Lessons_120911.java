package Lv0.Lessons_120911;

import java.util.Arrays;

public class Lessons_120911 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("Python"));
	}

}
//class Solution {
//    public String solution(String my_string) {
//        my_string = my_string.toLowerCase();
//        String[] arr = my_string.split("");
//        Arrays.sort(arr);
//        return String.join("",arr);
//    }
//}

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}