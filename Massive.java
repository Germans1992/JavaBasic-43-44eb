package homework.java.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//First level: level1:
//Создайте массив размером 100 символов, заполните все ячейки значением
// 10. 1 и 99 ячейки заполните значениями, равными 0

        int[] firstMas = new int[100];

        for (int i = 0; i < 99; i++) {
            firstMas[i] = 10;
            firstMas[1] = 0;
            firstMas[99] = 0;
        }
        System.out.println(Arrays.toString(firstMas));


        //level2:
//Создайте массив размером 100 символов, заполните все ячейки согласно
// такому правилу: 1 ячейка - 111, 2ая - 222, 3ая - 333,….  11ая - 111, 12ая - 222, 13ая - 333. Найдите сумму значений всех ячеек


        int[] secondMas = new int[100];
        int total = 0;

        for (int i =0; i < 100; i++) {
           secondMas[i] = (i % 10) * 111;
           total += secondMas[i];
            }
        System.out.println(Arrays.toString(secondMas));
        System.out.print("Вывод общей суммы = " + total);
    }
}
