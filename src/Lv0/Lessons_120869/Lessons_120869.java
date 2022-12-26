package Lv0.Lessons_120869;

public class Lessons_120869 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] spell = { "z", "d", "x" };
		String[] dic = { "def", "dww", "dzx", "loveaw" };
		System.out.println(solution.solution(spell, dic));
	}

}

class Solution {
	public int solution(String[] spell, String[] dic) {

		int answer = 2;

		for (int i = 0; i < spell.length; i++) {
			for (int j = 0; j < dic.length; j++) {
				if (dic[j].contains(spell[i])) {
					dic[j] = dic[j].replaceFirst(spell[i], "");
				} else {
					dic[j] += spell[i];
				}
			}
		}
		for (int i = 0; i < dic.length; i++) {
			if (dic[i].equals("")) {
				answer = 1;
				break;
			}
		}
		return answer;
	}
}