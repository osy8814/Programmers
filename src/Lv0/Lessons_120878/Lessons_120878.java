package Lv0.Lessons_120878;

import java.util.ArrayList;
import java.util.List;

public class Lessons_120878 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(1, 6));

	}

}

class Solution {
    public int solution(int a, int b) {
    	List<Integer>list = new ArrayList<>();
    	    	
    	int max = Math.max(a, b);
    	int GCD = 1;
    	
    	for (int i = max; i >= 2; i--) {
			if(a%i==0 && b%i==0) {
				GCD=i;
                break;
			}
		}
    	a = a/GCD;
    	b = b/GCD;
    	
    	System.out.println(GCD);
    	
    	if(a%b==0) {
    		return 1;
    	}
    	
    	for (int i = 2; i <= b; i++) {
			if(b%i==0) {
				int count=0;
				for (int j = 2; j <= i; j++) {
					if(i%j==0) {
						count++;
					}
				}
				if(count==1) {
					list.add(i);
				}
			}
		}
    	
    	list.remove(Integer.valueOf(2));
    	list.remove(Integer.valueOf(5));
    	    	
    	if(list.size()==0) {
    		return 1;
    	}
        return 2;
    }
}