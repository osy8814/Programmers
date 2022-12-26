package Lv0.Lessons_120883;

import java.util.HashMap;
import java.util.Map;

public class Lessons_120883 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] id_pw = { "meosseugi", "1234" };
		String[][] db = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		System.out.println(solution.solution(id_pw, db));
	}

}

class Solution {
	public String solution(String[] id_pw, String[][] db) {
		Map<String, String> memberTable = new HashMap<>();

		for (int i = 0; i < db.length; i++) {
			memberTable.put(db[i][0], db[i][1]);
		}
		try {
			if (memberTable.get(id_pw[0]).equals(id_pw[1])) {
				return "login";
			} else if (!memberTable.get(id_pw[0]).equals(id_pw[1]) && memberTable.get(id_pw[0]) != "") {
				return "wrong pw";
			} else {
				return "fail";
			}
		} catch (Exception e) {
			return "fail";
		}
	}
}