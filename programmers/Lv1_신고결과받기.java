package programmers;

import java.util.*;

public class Lv1_신고결과받기 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] rep_num = new int[id_list.length];
        ArrayList<ArrayList<String>> rep = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(id_list));

        for(int i = 0; i < id_list.length; i++) {
            rep.add(new ArrayList<>());
        }

        for(String str : report) {
            String[] info = str.split(" ");
            int reported = list.indexOf(info[1]);

            if(!rep.get(reported).contains(info[0])) {
                rep_num[reported]++;
                rep.get(reported).add(info[0]);
            }
        }

        for(int i = 0; i < id_list.length; i++) {
            if(rep_num[i] >= k) {
                ArrayList<String> arrayList = rep.get(i);
                for(int j = 0; j < arrayList.size(); j++) {
                    int idx = list.indexOf(arrayList.get(j));
                    answer[idx]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] res = solution(id_list, report, k);

        for(int i : res) {
            System.out.print(i + " ");
        }
    }
}
