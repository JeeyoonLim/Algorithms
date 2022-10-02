package programmers;

public class Lv1_정수제곱근판별 {

    public static long solution(long n) {
        long answer = 0;

        double num = Math.sqrt(n);
        if(num == (int)num) {
            answer = (long)((num + 1) * (num + 1));
        } else {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }
}
