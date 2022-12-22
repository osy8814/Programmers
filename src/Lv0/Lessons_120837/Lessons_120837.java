package Lv0.Lessons_120837;

public class Lessons_120837 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(23));
	}

}
class Solution {
    public int solution(int hp) {
        int answer = hp/5 + (hp%5)/3 + (hp%5)%3 ;
        return answer;
    }
}