package programmers;

import java.util.*;

public class Lv1_로또의최고순위와최저순위 {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        List<Integer> list = new ArrayList<>();
        int zero_num = Collections.frequency(list, 0);
        int correct_num = 0;

        for(int i : lottos) {
            list.add(i);
        }

        for(int i : win_nums) {
            if(list.contains(i)) {
                correct_num++;
            }
        }

        answer[0] = rank[correct_num + zero_num];
        answer[1] = rank[correct_num];

        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] arr = solution(lottos, win_nums);

        for(int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
