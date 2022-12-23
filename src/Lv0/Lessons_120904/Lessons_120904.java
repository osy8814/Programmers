package Lv0.Lessons_120904;

public class Lessons_120904 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(291833,3));
	}

}
class Solution {
    public int solution(int num, int k) {
        String strNum = num+"";
        String strK = k+"";
        int answer = strNum.indexOf(strK);
        return answer>-1 ? ++answer : answer;
    }
}