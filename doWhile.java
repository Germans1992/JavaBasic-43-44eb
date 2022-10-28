package homework.java.homework;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //First level: Level1
        //Дано целое число, не меньшее 2. Выведите его наименьший делитель, отличный от 1.
        // (число, на которое введенное число делится без остатка).

        int num = 12; //Число которое делим
        int i = 2;//наш минимальный делитель
        while (num % i != 0) { // условия по делению
            i++;
        }
        System.out.println(i);
        //Level 2
        //Вклад в банке составляет x рублей. Ежегодно он увеличивается
        // на p процентов, после чего дробная часть копеек отбрасывается.
        // Каждый год сумма вклада становится больше. Определите,
        // сколько будет на счету через k лет
        System.out.println("Денег на моем счету: ");
        int bankDeposit = scanner.nextInt();
        System.out.println("Годовые проценты: ");
        double everyYearPercent = scanner.nextInt();

        everyYearPercent /= 100;
        System.out.println("Количество лет по вкладу ");
        int years = scanner.nextInt();
        while(years >= 1){
            bankDeposit += everyYearPercent * bankDeposit;
            years--;
        }
        System.out.println("В конце срока вклад станет " + bankDeposit);

    }
}
