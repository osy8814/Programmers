package Lv0.Lessons_120882;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lessons_120882 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] score = {{1,2},{1,2},{1,2},{1,1},{1,1},{0,1}};
//		int[][] score = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 }};
//		int[][] score = { { 1, 2 }, { 1, 1 }, { 1, 1 } };
//		int[][] score = {{0, 20}, {80, 100}, {10, 10}, {90, 90}, {20, 0}};
		System.out.println(Arrays.toString(solution.solution(score)));

	}

}

class Solution {

	public int[] solution(int[][] score) {

		List<Integer>scoreList = new  ArrayList<>();
		
		for (int i = 0; i < score.length; i++) {
			scoreList.add(score[i][0] + score[i][1]);
		}
		scoreList.sort(Comparator.reverseOrder());
		System.out.println(scoreList);
		
		int[] answer = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
		}

		return answer;
	}
}

//class Solution {
//
//	public int[] solution(int[][] score) {
//
//		int[] sumScore = new int[score.length];
//
//		for (int i = 0; i < sumScore.length; i++) {
//			sumScore[i] = (score[i][0] + score[i][1]);
//		}
//
//		int[] removeDuplication = Arrays.stream(sumScore).distinct().toArray();
//
//		removeDuplication = Arrays.stream(sumScore).boxed().sorted(Collections.reverseOrder())
//				.mapToInt(Integer::valueOf).toArray();
//		
//		Map<Integer, Integer> map = new HashMap<>();
//
//		int order = 1;
//
//		for (int i = 0; i < removeDuplication.length; i++) {
//
//			for (int j = 0; j < sumScore.length; j++) {
//				if (removeDuplication[i] == sumScore[j]) {
//					if (!map.containsKey(sumScore[j])) {
//						map.put(sumScore[j], order);
//					}
//				}
//			}
//			order++;
//		}
//		map.forEach((key, value) -> {
//			System.out.println(key + " : " + value);
//			for (int i = 0; i < sumScore.length; i++) {
//				if(key==sumScore[i]) {
//					sumScore[i]=value;
//				}
//				
//			}
//		});
//	
//		return sumScore;
//	}
//}	