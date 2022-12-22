package Lv0;

import java.util.Arrays;

public class Lessons_120854 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[]strlist= {"We", "are", "the", "world!"};	
		System.out.println(Arrays.toString(solution.solution(strlist)));
	}

}
class Solution {
    public int[] solution(String[]strlist) {
    	int[] strslength = new int[strlist.length];
    	for (int i = 0; i < strslength.length; i++) {
    		strslength[i] = strlist[i].length();
		}
    	return strslength; 
    }
}