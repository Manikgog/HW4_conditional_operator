import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int age = in.nextInt();
        System.out.print("Если возраст человека равен " + age + " " + year(age) + ", то он");
        if(age >= 18)
            System.out.println(" совершеннолетний.\n");
        else
            System.out.println(" не достиг совершеннолетия, нужно немного подождать.\n");

        System.out.println("Задача 2.");
        System.out.print("Введите значение температуры воздуха на улице: ");
        int temperature = in.nextInt();
        System.out.print("На улице " + temperature + " " + degree(temperature) + ",");
        if(temperature < 5)
            System.out.println(" нужно надеть шапку.\n");
        else
            System.out.println(" можно идти без шапки.\n");

        System.out.println("Задача 3.");
        System.out.print("Введите значение скорости автомобиля: ");
        int velocity = in.nextInt();
        System.out.print("Если скорость " + velocity + " км/ч,");
        if(velocity < 60)
            System.out.println(" то можно ездить спокойно.\n");
        else
            System.out.println(" то придётся заплатить штраф.\n");

        System.out.println("Задача 4.");
        System.out.print("Введите значение возраста человека: ");
        age = in.nextInt();
        System.out.print("Если возраст человека равен " + age + " " + year(age) + ", то ему нужно ходить");
        if(age >= 2 && age <= 6)
            System.out.println(" в детский сад.\n");
        else if(age >= 7 && age <= 18)
            System.out.println(" в школу.\n");
        else if(age > 18 && age < 24)
            System.out.println(" в университет.\n");
        else if(age >= 24)
            System.out.println(" на работу.\n");

        System.out.println("Задача 5.");
        System.out.print("Введите значение возраста ребёнка: ");
        age = in.nextInt();
        System.out.print("Если возраст человека равен " + age + " " + year(age) + ", то ему");
        if(age < 5)
            System.out.println(" нельзя кататься на аттракционе.\n");
        else if(age < 14)
            System.out.println(" можно кататься на аттракционе в сопровождении взрослого.\n");
        else
            System.out.println(" можно кататься на аттракционе без сопровождения взрослого.\n");

        System.out.println("Задача 6.");
        int carCapacity = 102;
        int numberOfSeats = 60;
        int numberOfOccupiedPlaces;
        System.out.print("Введите количество занятых мест в вагоне: ");
        numberOfOccupiedPlaces = in.nextInt();
        if(numberOfOccupiedPlaces < numberOfSeats)
            System.out.println("В вагоне есть сидячих мест - " + (numberOfSeats - numberOfOccupiedPlaces) +
                    " и стоячих мест - " + (carCapacity - numberOfSeats) + ".\n");
        else
            System.out.println("В вагоне сидячих мест нет. " +
                    "Стоячих мест - " + (carCapacity - numberOfOccupiedPlaces) + ".\n");

        System.out.println("Задача 7.");
        int one;
        int two;
        int three;
        System.out.print("Введите значение первого числа: ");
        one = in.nextInt();
        System.out.print("Введите значение второго числа: ");
        two = in.nextInt();
        System.out.print("Введите значение третьего числа: ");
        three = in.nextInt();
        if(one > two && one > three)
            System.out.println("Большее из трёх введённых чисел равно " + one);
        else if (two > one && two > three)
            System.out.println("Большее из трёх введённых чисел равно " + two);
        else
            System.out.println("Большее из трёх введённых чисел равно " + three);
    }

    private static String year(int age){
        if(age == 1)
            return "году";
        else if(age > 20){
            if(age%10 == 1)
                return "году";
        }
        return "годам";
    }

    private static String degree(int degree){
        if(degree == 1)
            return "градус";
        else if(degree > 1 && degree <= 4)
            return "градуса";
        else if(degree > 20){
            if(degree%10 == 1)
                return "градус";
            if(degree%10 > 1 && degree%10 <= 4)
                return "градусa";
        }
        return "градусов";
    }

}