package org.example.homework;


public class Homework {

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public void turnString(String string) {
        char[] arrString = string.toCharArray();
        char[] newString = new char[string.length()];
        int j = 0;
        for (int i = string.length()-1; i > -1; i--) {
            newString[i] = arrString[j];
            j++;
        }
        String str = new String(newString);
        System.out.printf(str);
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public void getDistinctNumbers(int[] ints) {
        int trigger =0;
        for (int i = 0; i < ints.length; i++) {


            for (int j = 0; j < ints.length; j++) {
                if (ints[i] == ints[j] && i != j){
                    trigger++;
                    break;
                }

            }
            if (trigger==0){
                System.out.printf(ints[i] + "");
            }
            trigger = 0;
        }
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        return null;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        return null;
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        return false;
    }
}
