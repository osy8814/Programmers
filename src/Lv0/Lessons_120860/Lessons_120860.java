package Lv0.Lessons_120860;

public class Lessons_120860 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}}	;
		System.out.println(solution.solution(dots));
	}

}
class Solution {
    public int solution(int[][] dots) {
        int maxX = -256;
        int minX = 256; 
        int maxY = -256;
        int minY = 256;
                
        for (int i = 0; i < dots.length; i++) {
			if(dots[i][0]>maxX) {
				maxX=dots[i][0];
			}
			if(dots[i][0]<minX) {
				minX=dots[i][0];
			}
			if(dots[i][1]>maxY) {
				maxY=dots[i][1];
			}
			if(dots[i][1]<minY) {
				minY=dots[i][1];
			}
		}
        
        return (maxX-minX)*(maxY-minY);
    }
}