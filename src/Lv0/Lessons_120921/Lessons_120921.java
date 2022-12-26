package Lv0.Lessons_120921;

public class Lessons_120921 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("hello","elloh"));
	}

}

class Solution {
    public int solution(String A, String B) {
        
    	if(A.equals(B)) {
    		return 0;
    	}
    	
    	String tempString = A+A;
        int index = tempString.indexOf(B);
        
        if(index!=-1) {
        	return A.length() - index;
        }else {
        	return -1;
        }
    }
}

////미는 방향을 고려하지 않은 코드
//class Solution {
//    public int solution(String A, String B) {
//            	
//    	String tempString = A+A;
//        
//    	int index = tempString.indexOf(B);
//        
//        return Math.min(index, A.length()-index);
//    }
//}

