package Lv0;

import java.util.Calendar;

public class Lessons_120820 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(23));

	}

}
class Solution {
    public int solution(int age) {
        Calendar calendar = Calendar.getInstance();
        int thisYear = calendar.get(Calendar.YEAR);
        
//        return thisYear-age+1;
    	return 2022-age+1;
    }
}