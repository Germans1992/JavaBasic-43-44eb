package homework.newlessons;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Количество лет стажа: ");
        int first = sc.nextInt();
        System.out.println("Бонус за каждый год: ");
        int everyYearBonus = sc.nextInt();
        System.out.println("Бонус за каждые 10 лет работы: ");
        int everyTenYearsBonus = sc.nextInt();

        System.out.println("Ваш результат: ");
        System.out.println((first * everyYearBonus) + (first / 10 * everyTenYearsBonus));

    }
}
