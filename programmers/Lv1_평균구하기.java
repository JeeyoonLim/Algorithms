package programmers;

public class Lv1_평균구하기 {

    public static double solution(int[] arr) {
        double answer = 0 ;
        double sum = 0;

        for(double i : arr) {
            sum += i;
        }
        answer = sum / arr.length;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 5};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
