package Lv0.Lessons_120812;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lessons_120812 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = { 1,1,1,1, 2, 3,3,3, 4 };
		System.out.println(solution.solution(array));

	}

}

class Solution {
	public int solution(int[] array) {
		
		int[] number = Arrays.stream(array).distinct().toArray();
		
		int[] count = new int[number.length];
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (number[i] == array[j]) {
					count[i]++;
				}
			}
		}
		
		int max = Arrays.stream(count).max().getAsInt();
		int maxIndex = IntStream.range(0, count.length).filter(i-> count[i]==max).findFirst().orElse(-1);
		int duplication = (int)Arrays.stream(count).filter(x -> x==max).count();
	
		if(duplication>1) {
			return -1;
		}else {
			return number[maxIndex];
		}
		
	}
}