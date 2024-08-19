package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/*
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int cola = console.nextInt();
        int people = console.nextInt();
        double res = cola * 1.0 / people;

        System.out.println(res);
    }
}
