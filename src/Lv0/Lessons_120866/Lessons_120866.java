package Lv0.Lessons_120866;

public class Lessons_120866 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0 },
				{ 0, 0, 0, 0, 0 } };

		System.out.println(solution.solution(board));
	}

}

class Solution {
	public int solution(int[][] board) {

		int answer = 0;

		int[] arrI = {-1,-1,-1,0,0,1,1,1};
		int[] arrJ = {-1,0,1,-1,1,-1,0,1};
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 1) {

					for (int k = 0; k < arrJ.length; k++) {
						try {
							if(board[i+arrI[k]][j+arrJ[k]]!=1) {
								board[i+arrI[k]][j+arrJ[k]] = 2;	
							}							
						} catch (Exception e) {
							continue;
						}
					}
				}
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 0) {
					answer++;
				}
			}
		}

		return answer;
	}
}