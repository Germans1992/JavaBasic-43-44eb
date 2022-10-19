package homework.java.homework;

import java.util.Random;
import java.util.Scanner;

public class cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //First level: Вводится число. Напишите на экран сообщение
        // "Я начинаю разбираться с циклами" количество раз, равное этому числу
      int number = scanner.nextInt();
       while (number > 0) {
           number--;
          System.out.println("Я начинаю разбираться с циклами");
        }
    //Second level: В программу вводится 1 число. Выведите на экран его факториал, используя цикл while
    //https://math-prosto.ru/ru/pages/factorial/factorial/
    int num = scanner.nextInt();
    int i = 1;
    int output = 1;
    while (i <= num){
        output = output * i;
        i++;
    }
    System.out.println("output: " + output);
    }
}