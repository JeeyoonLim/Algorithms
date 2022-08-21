package programmers;

import java.util.*;

public class Lv1_성격유형검사하기 {
    public static String solution(String[] survey, int[] choices) {

        String answer = "";
        Vector<String> flag = new Vector<>(Arrays.asList("R", "T", "C", "F", "J", "M", "A", "N"));
        int[] score = new int[8];

        for(int i = 0; i < survey.length; i++) {
            int idx = 0;

            String c1 = survey[i].substring(0, 1);
            String c2 = survey[i].substring(1);

            if(choices[i] < 4) {
                idx = flag.indexOf(c1);
                score[idx] += (4 - choices[i]);
            } else if(choices[i] > 4) {
                idx = flag.indexOf(c2);
                score[idx] += (choices[i] - 4);
            }
        }

        for(int i = 0; i < flag.size(); i += 2) {
            if(score[i] > score[i + 1]){
                answer += flag.get(i);
            } else if (score[i] < score[i + 1]){
                answer += flag.get(i + 1);
            } else {
                String str = flag.get(i).compareTo(flag.get(i + 1)) > 0 ? flag.get(i + 1) : flag.get(i);
                answer += str;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        System.out.println(solution(survey, choices));
    }
}
