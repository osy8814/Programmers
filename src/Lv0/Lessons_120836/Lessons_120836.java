package Lv0.Lessons_120836;

public class Lessons_120836 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(100));
	}

}
class Solution {
    public int solution(int n) {
    	int count = 0;
    	for (int i = 1; i <= n; i++) {
    		if(n%i==0) {
    			count++;
    		}
		}
    	return count; 
    }
}