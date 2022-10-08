package homework.java;

import java.util.Scanner;

public class HomeworkString {
    public static void main(String[] args) {

        //First level: 1) В программу (в консоль) вводится строка.
        // Найдите длину строки, если она больше 10, то выведите true, иначе false
        //2) В программу (в консоль) вводится строка.
        // Если первый и последний символ равны - выведите true, иначе false
        //Second level: В программу вводится строка из двух букв
        // A и B, замените все буквы A на B, а все B на A. Например ABBA -> BAAB

        //Задача номер 1
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        boolean check = firstString.length() >= 10;
        System.out.println(check);

        int firstSymbol = firstString.charAt(0);
        int secondSymbol = firstString.charAt(firstString.length() - 1);
        boolean checkTwo = firstSymbol == secondSymbol;
        System.out.println(checkTwo);

        String secondString = scanner.nextLine();

        secondString = secondString.replace('A', 'B');
        secondString = secondString.replace("BBBB", "BAAB");
        System.out.println(secondString);

    }
}
