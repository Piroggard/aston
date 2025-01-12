package org.example;

import org.example.homework.Homework;

public class Main {
    public static void main(String[] args) {
        Homework homework = new Homework();
        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8};
        homework.turnString("I love Java");
        homework.getDistinctNumbers(ints);
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        System.out.println(homework.findSecondMaxElement(arr));
        System.out.println(homework.lengthOfLastWord("Hello world"));
        System.out.println(homework.isPalindrome("112211"));
    }
}