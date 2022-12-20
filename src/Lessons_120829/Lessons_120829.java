package Lessons_120829;

public class Lessons_120829 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(20));
	}

}
class Solution {
    public int solution(int angle) {
    	int answer = 0;

    	if(angle < 90) {
    		answer = 1;
        }else if (angle == 90) {
			answer = 2;
		}else if (angle > 90 && angle <180) {
			answer = 3;
		}else {
			answer = 4;
		}
    	
        return answer;
    }
}