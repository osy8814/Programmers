package Lv1.Lessons_12937;

public class Lessons_12937 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String answer = solution.solution(3);
		System.out.println(answer);
		
	}

}
class Solution {
    public String solution(int num) {
        String answer = "";
        switch(num%2){
            case 0 :
                answer = "Even";
                break;
                
            default :
                answer = "Odd";
                
                
        }
        
        return answer;
    }
}