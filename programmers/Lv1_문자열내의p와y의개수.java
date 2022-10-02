package programmers;

public class Lv1_문자열내의p와y의개수 {

    public static int count(String s, String target) {
        int cnt = s.length() - s.replace(target, "").length();

        return cnt;
    }

    public static boolean solution(String s) {
        boolean answer = true;
        String str = s.toLowerCase();

        if(count(str, "p") != count(str, "y")) answer = false;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }
}
