package Lv0.Lessons_120885;

public class Lessons_120885 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("10", "11"));
	}

}

class Solution {
	public String solution(String bin1, String bin2) {
				
		return  Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2)) ;
	}
}