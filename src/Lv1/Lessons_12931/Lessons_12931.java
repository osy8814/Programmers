package Lv1.Lessons_12931;

public class Lessons_12931 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int answer = solution.solution(987);
		System.out.println(answer);
		
	}

}
class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer+=n%10;
            n/=10;
        }
       
        return answer;
    }
}