package homework;

public class Homework {
    public static void main(String[] args) {

        //Уровень задания 1

        int number = 179;
        int newNumber = number + 1;
        System.out.println("The next number for the number " + number + " is " + newNumber + ".");
        newNumber = number - 1;
        System.out.println("The previous number for the number " + number + " is " + newNumber + ".");

        //Уровень задания 2

        int n = 3;
        int k = 14;
        int c = k % n;
        System.out.println("Остаток в корзине " + c + ".");
        int a = k / 10 % 10;
        System.out.println("Количество десятков " + a + ".");
    }
}
