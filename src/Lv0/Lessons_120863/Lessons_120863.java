package Lv0.Lessons_120863;

public class Lessons_120863 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("3x + 7 + x"));
	}

}

class Solution {
    public String solution(String polynomial) {

    	String[] arr = polynomial.split(" ");
    	
    	int x = 0;
    	int number = 0;
 
    	for (String string : arr) {
    		try {
				number += Integer.valueOf(string); 
			} catch (Exception e) {
				if(string.contains("x")) {
					try {
						x += Integer.valueOf((string.replace("x", "")));  
					} catch (Exception e2) {
						x += 1;
					}
				}
			}
    		
		}
    	if(x==0) {
    		return number+"";
    	}else if(number==0) {
    		return  x+"x";
    	}else {
    		return x+"x + "+number;
    	}
    	
    	
    }
}