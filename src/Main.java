public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int age1 = 22;
        if (age1 >= 18)
        {System.out.println("Поздравляем! Вы - совершеннолетний!");}
        if (age1 < 18)
        {System.out.println("К сожалению, возрасть совершеннолетия ещё не достигнут, поождите немного.");}

        // Задача 2
        System.out.println("Задача 2");
        int age2 = 22;
        if (age2 >= 7 && age2 < 18)
        {System.out.println("Ребенок ходит в школу.");}
        if (age2 >= 18 && age2 <24)
        {System.out.println("Человек ходит в университет.");}
        if (age2 >= 24)
        {System.out.println("Человек ходит на работу.");}

        // Задача 3
        System.out.println("Задача 3");
        int capacityOf1TrainCar = 102;
        int sittingPlace = 60;
        int standingPlace = capacityOf1TrainCar - sittingPlace;
        int passengers =67;
        if (passengers <= 60)
        {System.out.println("Есть " + (sittingPlace - passengers) + " сдячих мест и " + standingPlace + " стоячих мест.");}
        if (passengers > 60 && passengers <= 102)
        {System.out.println("Сидячих мест не осталось, однако, осталось " + (standingPlace - (passengers - sittingPlace)) + " стоячих мест.");}
        if (passengers > 102)
        {System.out.println("К сожалению, ни стоячих, ни сидячьих мест не осталось. Вагон заполнен.");}

        // Задача 4
        System.out.println("Задача 4");
        int age4 = 22;
        if (age4 >= 18)
        {System.out.println("Поздравляем! Вы - совершеннолетний!");} else {System.out.println("К сожалению, возрасть совершеннолетия ещё не достигнут, поождите немного.");}

        //Задача 5
        System.out.println("Задача 5");
        int age5 = 22;
        if (age5 >= 7 && age5 < 18)
        {System.out.println("Ребенок ходит в школу.");}
        else if (age5 >= 18 && age5 <24)
        {System.out.println("Человек ходит в университет.");} else {System.out.println("Человек ходит на работу.");}

        //Задача 6
        System.out.println("Задача 6");
        int capacityOf1TrainCar6 = 102;
        int sittingPlace6 = 60;
        int standingPlace6 = capacityOf1TrainCar6 - sittingPlace6;
        int passengers6 = 101;
        if (passengers6 <= 60)
        {System.out.println("Есть " + (sittingPlace6 - passengers6) + " сдячих мест и " + standingPlace6 + " стоячих мест.");}
        else if (passengers6 > 60 && passengers6 <= 102)
        {System.out.println("Сидячих мест не осталось, однако, осталось " + (standingPlace6 - (passengers6 - sittingPlace6)) + " стоячих мест.");} else {System.out.println("К сожалению, ни стоячих, ни сидячьих мест не осталось. Вагон заполнен.");}

        //Задача 7
        System.out.println("Задача 7");
        int age7 = 22;
        if (age7 > 2 && age7 <= 6)
        {System.out.println("Если ребёнку " + age7 + " лет, то ему стоит пойти в десткий сад.");}
        else if (age7 >=7 && age7 < 18)
        {System.out.println("Если ребёнку " + age7 + " лет, то ему стоит пойти в школу.");}
        else if (age7 > 18 && age7 <= 24)
        {System.out.println("Если возраст человека равен: " + age7 + ", то ему стоит  пойти в университет.");} else {System.out.println("Если возраст человека равен: " + age7 + ", то ему пора ходить на работу.");}

        //Задача 8
        System.out.println("Задача 8");
        int age8 = 9;
        if (age8 < 5)
        {System.out.println("Если возраст ребёнка равен: " + age8 + ", то он не может кататься на атракционе.");}
        else if (age8 >=7 && age8 < 14)
        {System.out.println("Если возраст ребёнка равен: " + age8 + ", то он может кататься на атракционе только в сопровождении взрослого, если такого нет, то кататься на атракционе запрещено.");} else {System.out.println("Если возраст ребенка: " + age8 + ", то он может кататься на атракционе без сопровождения взрослого.");}

        //Задача 9
        System.out.println("Задача 9");
        int one = 6;
        int two = 16;
        int free = 67;
        if (one > two && one > free)
        {System.out.println("Масимальное число " + one + ".");}
        else if (two > one && two > free)
        {System.out.println("Максимальное число " + two + ".");}
        else if (free > one && free > two)
        {System.out.println("Максимальное число " + free + ".");} else {System.out.println("Все 3 числа равны.");}
    }
}