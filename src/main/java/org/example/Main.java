package org.example;


import org.example.homework.Homework;

public class Main {
    public static void main(String[] args) {
            Homework homework = new Homework();
            int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8};
            //turnString("I love Java");
            homework.getDistinctNumbers(ints);


    }
}