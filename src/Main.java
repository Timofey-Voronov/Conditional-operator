public class Main {
public static void main(String[] args) {

    // Задача 1

    int age = 20;

    if (age >= 18) {
    System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
    }
    else {
    System.out.println("Если возраст человека равен " + age +
    ", то он не достиг совершеннолетия, нужно немного подождать");
    }


    // Задача 2

    int temperatureValue = 5;

    if (temperatureValue < 5) {
        System.out.println("На улице холодно, нужно надеть шапку");

    } else {
        System.out.println("Сегодня тепло, можно идти без шапки");
    }


    if (temperatureValue < 5) {
    System.out.println("На улице " + temperatureValue + " градусов, нужно надеть шапку");

    } else {
    System.out.println("На улице " + temperatureValue + " градусов, можно идти без шапки");
    }


    // Задача 3

    int speedOfDriver = 60;

    if (speedOfDriver <= 60) {
        System.out.println("Если скорость " + speedOfDriver + ", можно ездить спокойно");
    } else {
        System.out.println("Если скорость " + speedOfDriver + ", придется заплатить штраф");
    }



    // Задача 4

    int age2 = 40;

    if (age2 >= 2 && age2 <= 6) {
    System.out.println("Если возраст человека равен " + age2 +
    ", то ему нужно ходить в детский сад");
    }
    if (age2 >= 7 && age2 <= 17) {
    System.out.println("Если возраст человека равен " + age2 +
    ", то ему нужно ходить в школу");
    }
    if (age2 >= 18 && age2 <= 24) {
    System.out.println("Если возраст человека равен " + age2 +
    ", то его место в университете");
    }
    if (age2 > 24) {
    System.out.println("Если возраст человека равен " + age2 +
    ", то ему пора ходить на работу");
    }


    // Задача 5

    int age3 = 10;

    if (age3 < 5) {
    System.out.println("Если возраст ребенка равен " + age3 +
    ", то ему нельзя кататься на аттракционе");
    }

    else if (age3 >= 5 && age3 < 14) {
    System.out.println("Если возраст ребенка равен " + age3 +
    ", можно кататься на аттракционе в сопровождении взрослого");

    } else {
    System.out.println("Если возраст ребенка равен " + age3 +
    ", можно кататься на аттракционе без сопровождения взрослого");
    }


    if (age3 < 5) {
        System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе");
    }
    else if (age3 >= 5 && age3 < 14) {
        System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого." +
                " Если взрослого нет, то кататься нельзя");
    } else {
        System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого");
    }


    // Задача 6

    int quantityOfPassengers = 60;

    if (quantityOfPassengers <= 60) {
    System.out.println("В вагоне имеются сидячие места");
    }
    else if (quantityOfPassengers > 60 && quantityOfPassengers <= 102) {
    System.out.println("В вагоне остались стоячие места");
    }
    else {
    System.out.println("В вагоне мест нет");
    }


    // Задача 7

    int one = 50;
    int two = 100;
    int three = 1000;

    if (one > two && one > three) {
    System.out.println(one);
    }
    else if (two > one && two > three) {
    System.out.println(two);
    }
    else {
    System.out.println(three);
    }


    }
}