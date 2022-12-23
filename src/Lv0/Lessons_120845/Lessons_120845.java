package Lv0.Lessons_120845;

public class Lessons_120845 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[]box = {10, 8, 6};
		System.out.println(solution.solution(box,3));
	}

}
class Solution {
    public int solution(int[] box, int n) {
        return (box[0]/n)*(box[1]/n)*(box[2]/n);
    }
}