package Lv0.Lessons_120912;

public class Lessons_120912 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = {7, 77, 17};
		System.out.println(solution.solution(array));

	}

}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
			int originalLength = (array[i]+"").length();
			int replacedLength = (array[i]+"").replaceAll("7", "").length();
			answer += originalLength - replacedLength;
		}
    	return answer; 
    }
}