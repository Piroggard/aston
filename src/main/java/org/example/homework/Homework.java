package org.example.homework;

import java.util.Arrays;

public class Homework {

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public void turnString(String string) {
        char[] arrString = string.toCharArray();
        char[] newString = new char[string.length()];
        int j = 0;
        for (int i = string.length() - 1; i > -1; i--) {
            newString[i] = arrString[j];
            j++;
        }
        String str = new String(newString);
        System.out.printf(str);
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public void getDistinctNumbers(int[] ints) {
        int trigger = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] == ints[j] && i != j) {
                    trigger++;
                    break;
                }
            }
            if (trigger == 0) {
                System.out.printf(ints[i] + "");
            }
            trigger = 0;
        }
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public Integer findSecondMaxElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public Integer lengthOfLastWord(String string) {
        String[] arrString = string.split(" ");
        return arrString[arrString.length - 1].length();
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            System.out.println(" " + string.charAt(i) + "   --    " + string.charAt((string.length() - 1) - i));
            if (string.charAt(i) != string.charAt((string.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}
