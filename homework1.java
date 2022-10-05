package homework.newlessons;

import java.util.Scanner;

public class homework1{
    public static void main(String[] args) {
        //Do your homework of 2 choices. The first task is easy, the second is more difficult. We wish you good luck!
        //First level: С консоли считывается 3 оценки, которые Петя получил сегодня в школе.
        // Помогите ему посчитать свой средний балл, выведя его на экран

        //Задача номер 1:

        Scanner school = new Scanner(System.in);
        System.out.println("Математика: ");
        int Maths = school.nextInt();

        System.out.println("История: ");
        int History = school.nextInt();

        System.out.println("Спорт: ");
        int Sport = school.nextInt();

        System.out.println("Средний балл равен: ");
        System.out.println((Maths + History + Sport) / 3 );


        //Second level: Петя вырос и накопил денег на поездку на море. Но он переживает,
        // стоит ли туда ехать. Если температура воздуха будет больше, чем 28 градусов,
        // а температура воды больше 26 - тогда он готов поехать на море, иначе нет.
        //В программу вводится 2 числа - температура воздуха и воды.
        // Используя boolean переменные,
        // Выведите на экран true - если Петя готов ехать на море, и false - если не готов.

        //Задача номер 2:

        int waterTemperature = 27;// температура воды на курорте
        int airTemperature = 29;// температура воздуха на курорте

        boolean heWillGoForaTrip = waterTemperature > 26 && airTemperature > 28;
        System.out.println("Петя поедет на море, если вода и температура ему подойдут  " + heWillGoForaTrip);

        boolean heWillStayHome = waterTemperature < 26 && airTemperature < 28;
        System.out.println("Нравится ли Пете температура воды и воздуха? " + heWillStayHome);
    }
}