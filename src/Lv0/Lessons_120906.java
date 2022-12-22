package Lv0;

public class Lessons_120906 {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int answer = solution.solution(930211);
		System.out.println(answer);
	}

}

class Solution {
    public int solution(int n) {
    	int answer = 0;

    	while(n>0) {
    		answer += n%10;
    		n = n/10;
    	}
        return answer;
    }
}