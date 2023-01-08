package com.hillel.lessons.lesson7;

//import java.util.Arrays;

public class HW9 {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int sum1 = 0;
        int sum2 = 0;

        System.out.print("First team 'Wings': ");
        for (int i = 0; i < team1.length; i++) {

            team1[i] = (int) Math.round((Math.random() * 22) + 18);

            if (team1.length - 1 == i) {
                System.out.println(team1[i]);
            } else {
                System.out.print(team1[i] + ", ");
            }
        }

        for (int value : team1) {

            sum1 += value;
        }
        double avgTeam1 = (double) sum1 / team1.length;
        System.out.println("Average age of 'Wings' players: " + avgTeam1);

        System.out.print("First team 'Buffalo': ");
        for (int i = 0; i < team2.length; i++) {

            team2[i] = (int) Math.round((Math.random() * 22) + 18);
            if (team2.length - 1 == i) {
                System.out.println(team2[i]);
            } else {
                System.out.print(team2[i] + ", ");
            }
        }


//       mozhno bilo esch tak sdelat': System.out.println("Second team 'Buffalo':" + Arrays.toString(team2));

        for (int value1 : team2) {

            sum2 += value1;
        }
        double avgTeam2 = (double) sum2 / team2.length;
        System.out.println("Average age of 'Buffalo' players: " + avgTeam2);


    }
}
