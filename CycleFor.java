package homework.java.homework;

import java.util.Scanner;

public class CycleFor {
    public static void main(String[] args) {
        //First level: Level1 (решается через for)
        //Вводится n. Найдите сумму такого выражения: 1+1/2+1/3+1/4…..+1/n
        //

        //ХОТЕЛ БЫ С ВАМИ РАЗОБРАТЬ ПЕРВЫЙ ВАРИАНТ, НЕ ПОНИМАЮ КУДА ЗАПИСАТЬ ВЫРАЖЕНИЕ ТАКОГО ПЛАНА!!!


        //Level2 (решается через while)
        //Вводится число (число может быть и маленьким и большим), но вмешается в int.
        // Найти сумму всех цифр этого числа


        Scanner scanner = new Scanner(System.in);
        System.out.print("Вводим число ");
        int num = scanner.nextInt();
        System.out.print("Общая сумма чисел равна ");
        int sum = 0;
        while(num != 0) {
           sum = sum + num % 10;
           num /= 10;
        }
        System.out.println(sum);
        }
    }

