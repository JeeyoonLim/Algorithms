package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Lv1_자연수뒤집어배열로만들기 {

    public static int[] solution(long n) {
        ArrayList<Integer> arr = new ArrayList<>();

        while(n != 0) {
            arr.add((int)n % 10);
            n /= 10;
        }

        int[] answer = new int[arr.size()];

        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

/*        //StringBuffer
        String str = new StringBuffer(String.valueOf(n)).reverse().toString();
        String[] arr = str.split("");
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
*/
        return answer;
    }

    public static void main(String[] args) {
        int[] sol = solution(12345);

        for(int i : sol) {
            System.out.println(i);
        }
    }
}
