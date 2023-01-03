package Lv1.Lessons_12944;

public class Lessons_12944 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] arr= {1,2,3,4};
		double answer = solution.solution(arr);
		System.out.println(answer);
		
	}

}
class Solution {
    public double solution(int[] arr) {
        double sum=0;
        double answer = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        answer=sum/arr.length;
        return answer;
    }
}