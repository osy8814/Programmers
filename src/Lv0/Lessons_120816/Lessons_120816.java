package Lv0.Lessons_120816;

public class Lessons_120816 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(7,10));
	}

}
class Solution {
    public int solution(int slice, int n) {
       return (int) Math.ceil(n/(slice*1.0));
    }
}