package Lv0.Lessons_120922;

public class Lessons_120922 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(2,5));
	}

}

class Solution {
    public int solution(int M, int N) {
        
    	return (M-1)*N+(N-1) ;
    }
}