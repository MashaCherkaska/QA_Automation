package com.hillel.lessons.homework5;


public class HW5 {
    public static void main(String[] args) {


        int voinLi = 13;
        int lychnikLi = 24;
        int vershnikLi = 46;
        int typeLi = 860;

        int attackLi = (voinLi + lychnikLi + vershnikLi) * typeLi;
        System.out.println("The total attack score of Li:" + attackLi);

        int voinMin = 9;
        int lychnikMin = 35;
        int vershnikMin = 12;

        double typeMin = typeLi * 1.5;

        double attackMin = (voinMin + lychnikMin + vershnikMin) * typeMin;
        System.out.println("The total attack score of Min':" + attackMin);

        double generalAttackMinPlusLi = attackMin + attackLi;
        System.out.println("The total attack score of both armies:" + generalAttackMinPlusLi);


    }
}
