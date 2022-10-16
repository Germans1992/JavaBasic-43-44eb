package homework.java.homework;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        //First level: С консоли считывается число.
        // Если это число равно 0 - тогда напишите на экран "ошибок не обнаружено",
        // если число не равно 0, тогда выведите три сообщения "ERROR"

        //Second level: С консоли считывается строка,
        // если эта длина этой строки меньше 6 или последний символ НЕ '!',
        // тогда вывести "Ваш пароль неверный", иначе вывести "пароль принят"

        Scanner sc = new Scanner(System.in);


       String str = sc.nextLine();

       int sizeOfString = str.length();

       char last = str.charAt(sizeOfString -1);

        if (sizeOfString < 6 || last != '!' )
        {
            System.out.println("Ваш пароль неверный");
        }
        else {
            System.out.println("пароль принят");
        }

    }
}
