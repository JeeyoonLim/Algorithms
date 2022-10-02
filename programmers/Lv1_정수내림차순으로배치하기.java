package programmers;
import java.util.*;

public class Lv1_정수내림차순으로배치하기 {

    public static long solution(long n) {
        long answer = 0;

        List<String> list = new ArrayList<>(Arrays.asList(String.valueOf(n).split("")));
        list.sort(Comparator.reverseOrder());
        answer = Long.parseLong(String.join("", list));

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
