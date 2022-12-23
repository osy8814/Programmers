package Lv0.Lessons_120893;

//import java.util.regex.Pattern;

public class Lessons_120893 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("abCdEfghIJ"));
	}

}
//class Solution {
//    public String solution(String my_string) {
//        String[] arr = my_string.split("");
//        String answer = "";
//        
//        for (int i = 0; i < arr.length; i++) {
//			answer += Pattern.matches("[a-z]", arr[i]) ? arr[i].toUpperCase() : arr[i].toLowerCase();		
//		}        
//        return answer;
//    }
//}

class Solution {
	public String solution(String my_string) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			answer += Character.isLowerCase(my_string.charAt(i)) ? Character.toUpperCase(my_string.charAt(i))
					: Character.toLowerCase(my_string.charAt(i));
		}
		return answer;
	}
}