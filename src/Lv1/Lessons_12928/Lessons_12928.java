package Lv1.Lessons_12928;

public class Lessons_12928 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int answer = solution.solution(5);
		System.out.println(answer);
		
	}

}
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
           if(n%i==0)
               answer+=i; 
        }
        
        return answer;
    }
}