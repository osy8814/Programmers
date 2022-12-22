package Lv0.Lessons_120819;

import java.util.Arrays;

public class Lessons_120819 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int money = 15000;
		System.out.println(Arrays.toString(solution.solution(money)));
		
	}

}
class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        
        return answer;
    }
}