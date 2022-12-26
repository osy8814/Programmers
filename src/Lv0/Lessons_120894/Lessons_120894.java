package Lv0.Lessons_120894;

public class Lessons_120894 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("onetwothreefourfivesixseveneightnine"));

	}

}

class Solution {
    public long solution(String numbers) {
        
    	String [] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
      
    	for (int i = 0; i < number.length; i++) {
			numbers = numbers.replaceAll(number[i], i+"");
			
		}
    	
    	return Long.valueOf(numbers);
    }
}