package programmers;

import java.util.*;

public class Lv1_같은숫자는싫어 {

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i : arr) {
            if(stack.empty() || (!stack.empty() && stack.peek() != i)) {
                stack.push(i);
            }
        }

        int[] answer = new int[stack.size()];
        int idx = 0;

        for(int i : stack) {
            answer[idx++] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] sol = solution(arr);

        for(int i : sol) {
            System.out.print(i + ", ");
        }
    }
}
