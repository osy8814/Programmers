package Lv0.Lessons_120808;

import java.util.ArrayList;
import java.util.List;

public class Lessons_120808 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(10));
		
	}

}
class Solution {
    public List<Integer> solution(int n) {
    	List<Integer>list = new ArrayList<>();
    	for (int i = 1; i <= n; i++) {
			if(i%2!=0) {
				list.add(i);
			}
		}
    	return list; 
    }
}