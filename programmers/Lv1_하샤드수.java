package programmers;

public class Lv1_하샤드수 {

    public static boolean solution(int x) {
        boolean answer = true;
        int i = x, sum = 0;

        while(i != 0) {
            sum += i % 10;
            i /= 10;
        }

        if(x % sum != 0) answer = false;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }
}
