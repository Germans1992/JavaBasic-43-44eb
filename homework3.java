package homework.java.homework;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //First level: Найдите следующее четное число.
        //Например, вводится 140 -> выводим 142, вводится 93 -> выводим 94.
        //Решить задачу с помощью if
        int number = scanner.nextInt();
        if ((number + 1) % 2 == 0) {
            System.out.println(number + 1);
        } else {
            System.out.println(number + 2);
        }

        //Second level: Джон едет на поезде к Мэри. Шерлок Холмс решил вычислить,
        // где сейчас находится Джон: ближе к нему или к Мэри.
        //Шерлок знает, с какой скоростью едет поезд и сколько часов он уже едет.
        // Также он знает, сколько километров длится полная дорога от него к  Мэри.
        //В программу вводится 3 числа: время в пути, скорость поезда, длина полного пути.
        //Вывести на экран имя персонажа, к которому сейчас ближе Джон!

        int fullWayToMarry = scanner.nextInt();
        int trainSpeedInHour = scanner.nextInt();
        int hoursOnWay = scanner.nextInt();


        int howFarTrain = trainSpeedInHour * hoursOnWay;
        int howMuchIsLeft = fullWayToMarry - howFarTrain;

        if(howMuchIsLeft > fullWayToMarry / 2 ){
            System.out.println("Джон сейчас ближе к Шерлоку чем к Мэри");
        } else {
            System.out.println("Джон проехал больше пол пути, и ближе к Мэри");
        }

    }
}
