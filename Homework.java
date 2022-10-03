package homework;

public class Homework {
    public static void main(String[] args) {

        //Do your homework of 2 choices. The first task is easy, the second is more difficult. We wish you good luck!
        //First level: Феликс прожил 3011456_567 секунд. Сколько лет прожил Феликс? Посчитать, используя Java, Long-переменные и деление.
        //Кто не знает - по какой формуле посчитать - напишите мне, но сначала подумайте
        //Second level: Астерикс и Обеликс варили зелье.
        //Зелье будет сварено правильно, если его будут варить больше 5 часов или если варить будет Астерикс.
        //Дано: некоторое (любое) число, указывающее длительность варки, и boolean переменная, которая хранит true - если зелье варил Астерикс, и false - если Обеликс.
        //На экране должно быть написано true - если зелье получилось, false -если не получилось
        //Подсказка: последний урок, задача про "теплую одежду" - очень похоже решение
        //Подсказка2: || используем и boolean переменные

        long felix = 3011456_567L; // прожил секунд
        int year = 31_557_600; // секунд в году
        long felixsLife = felix / 31_557_600; // узнаем сколько лет прожил феликс
        System.out.println(felixsLife);

// Задача два
        boolean asterixBrewPowerDrink = true;
        boolean obelixBrewPowerDrink = false;
        int cookHours = 6;
        boolean correctPowerDrink = (cookHours > 5 || asterixBrewPowerDrink);
        System.out.println(correctPowerDrink);



    }
}
