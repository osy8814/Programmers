package Lv0.Lessons_120818;

public class Lessons_120818 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(10000));
	}

}
class Solution {
    public int solution(int price) {
        if(price>=100000 && price<300000) {
        	return (int) (price*0.95);
        }else if (price>=300000 && price<500000) {
			return (int) (price*0.9);
		}else if (price>=500000) {
			return (int) (price*0.8);
		}else {
			return price;
		}
    }
}