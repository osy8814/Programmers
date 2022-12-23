package Lv0.Lessons_120842;

import java.util.Arrays;

public class Lessons_120842 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948}; 
		System.out.println(Arrays.deepToString(solution.solution(num_list, 3)));
		
	}

}
class Solution {
	public int[][] solution(int[] num_list, int n) {
        
		int[][] answer = new int[num_list.length/n][n];
        int count = 0;
		for (int i = 0; i < num_list.length/n; i++) {
        	for (int j = 0; j < n; j++) {
				answer[i][j] = num_list[count];
				count++;
				
			}
			
		}
        
        return answer;
    }
}