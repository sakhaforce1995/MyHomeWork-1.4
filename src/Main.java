public class Main {
    public static void main(String args[]) {
        homework1();
        homework2();
        homework3();
    }

    public static void homework1() {
        //Задание 1
        int agesOld = 25;
        System.out.println("Задание 1");
        if (agesOld >= 18) {
            System.out.println("Поздравляем, вас с совершеннолетнием");
        }
        if (agesOld < 18) {
            System.out.println("Возраст совершеннолетния еще не наступил, еще нужно подождать");
        }

        //Задание 2
        System.out.println("Задание 2");
        if(agesOld >= 7 && agesOld < 18){
            System.out.println("Ребенок ходить в школу");
        }
        if (agesOld >= 18 && agesOld < 24){
            System.out.println("Человек ходить в университет");
        }
        if(agesOld >= 24){
            System.out.println("Человек ходит на работу");
        }

        //Задание 3
        System.out.println("Задание 3");
        int capacity = 102;
        int seatsCount = 60;
        int standsCount = capacity - seatsCount; // стоящие места

        int seatsUsed = 23;
        int standsUsed = 20;
        if(seatsUsed < seatsCount){
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + " сидяших мест");
        }
        if(seatsCount==seatsCount){
            System.out.println("Сидяших мест нет");
        }
        if(standsUsed < standsCount){
            System.out.println("Есть еще " + (standsCount - standsUsed) + " стоящих мест");
        }
        if(standsCount==standsCount){
            System.out.println("Стоящих мест нет");
        }
    }
    public static void homework2(){
        //Домашние Задания 2 - Задание 1
        int agesOld = 25;
        System.out.println("Домашние Задания 2 - Задание 1");
        if (agesOld >= 18) {
            System.out.println("Поздравляем, вас с совершеннолетнием");
        } else {
            System.out.println("Возраст совершеннолетния еще не наступил, еще нужно подождать");
        }

        //Задание 2
        System.out.println("Задание 2");
        if(agesOld >= 7 && agesOld < 18){
            System.out.println("Ребенок ходить в школу");
        }
        else if (agesOld >= 18 && agesOld < 24){
            System.out.println("Человек ходить в университет");
        }
        else if(agesOld >= 24){
            System.out.println("Человек ходит на работу");
        }

        //Задание 3
        System.out.println("Задание 3");
        int capacity = 102;
        int seatsCount = 60;
        int standsCount = capacity - seatsCount; // стоящие места

        int seatsUsed = 59;
        int standsUsed = 41;
        if(seatsUsed < seatsCount){
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + " сидяших мест");
        } else {
            System.out.println("Сидяших мест нет");
        }
        if(standsUsed < standsCount){
            System.out.println("Есть еще " + (standsCount - standsUsed) + " стоящих мест");
        } else {
            System.out.println("Стоящих мест нет");
        }
    }
    public static void homework3(){
        //Домашние Задания 3 - Задание 1
        System.out.println("Домашние Задания 3 - Задание 1");
        int agesOld = 15;
        if(agesOld >= 2 && agesOld <= 6){
            System.out.println("Если возраст человека равен " + agesOld + ", то ему нужно ходить в детский сад");
        } else if(agesOld > 6 && agesOld <=18){
            System.out.println("Если возраст человека равен " + agesOld + ", то ему нужно ходить в школу");
        } else if(agesOld > 18 && agesOld <=24){
            System.out.println("Если возраст человека равен " + agesOld + ", то ему нужно ходить в университет");
        } else if(agesOld > 24){
            System.out.println("Если возраст человека равен " + agesOld + ", то ему нужно ходить в работу");
        }

        //Задание 2
        System.out.println("Задание 2");
        if(agesOld < 5){
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (agesOld < 14){
            System.out.println("Ребенок может кататься на аттракционе, только сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься без сопровождении взрослого");
        }

        //Задание 3
        System.out.println("Задание 3");
        int one = 101;
        int two = 101;
        int three = 101;
        if(one > two){
            if(one >= three){
                System.out.println("Максимальное число - " + one);
            } else{
                System.out.println("Максимальное число - " + three);
            }
        } else if(two > one){
            if(two > three){
                System.out.println("Максимальное число - " + two);
            } else{
                System.out.println("Максимальное число - " + three);
            }
        } else {
            if (one > three){
                System.out.println("Максимальное число - " + one);
            } else if (three > one){
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все 3 числы равны ");

            }
        }
    }
}