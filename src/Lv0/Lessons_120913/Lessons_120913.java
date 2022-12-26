package Lv0.Lessons_120913;

import java.util.ArrayList;
import java.util.List;

public class Lessons_120913 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		System.out.println((solution.solution(my_str, n)));
	}

}

class Solution {
	public List<String> solution(String my_str, int n) {
		
		List<String> list = new ArrayList<>();
		
		StringBuffer sb = new StringBuffer(my_str);

		for (int i = 0; i < my_str.length(); i++) {
			if (sb.length() > n) {
				list.add(sb.substring(0, n));
				sb.replace(0, n, "");
			} else {
				list.add(sb.toString());
				break;
			}
		}
		return list;
	}
}

//class Solution {
//    public String[] solution(String my_str, int n) {
//        String[] answer = my_str.split("(?<=\\G.{"+n+"})");
//        return answer;
//    }
//}