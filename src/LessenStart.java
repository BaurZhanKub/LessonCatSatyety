import java.util.Random;
import java.util.Scanner;

public class LessenStart {
    static Scanner sn = new Scanner(System.in);
    static Random rn = new Random();
    static int satyety = catSatyety(0,10);
    static int desiredSatiety = catSatyety(0,10);
    public static void main(String[] args) {
        printFood();
        printDesiredSatiety();
        printSatiety();
        CatState state = feedCat();
        printState(state);

    }
     public static Food getFood(){
       // System.out.println("Введите название еды из списка");
         //         String input = sn.nextLine().toUpperCase();
         //         for (Food food : Food.values()) {
         //             if(food.name().equals(input)){
         //                 return food;
         //             }
         //         }
         //         System.out.println("Вы ввели неверные данные!");
         //         return getFood();
         //     }//
         int select = rn.nextInt(Food.values().length);
         Food food = Food.values()[select];
         System.out.println("Выбор:" + food.name() +"|"+ food.getFoodValue());
         return food;
     }

     public static CatState feedCat(){
        if (satyety>desiredSatiety){
            return CatState.BOSSE;
        }
        while (satyety<desiredSatiety) {
            Food food = getFood();
            changeSatyety(food.getFoodValue());
            printSatiety();
         }
         if (satyety == desiredSatiety){
             return CatState.FED;
         }
         return CatState.OVERFED;
     }

     public static void printFood(){
         for (Food food : Food.values()) {
             System.out.printf("%s %s, ",food.name(),food.getFoodValue());
         }
         System.out.println();
     }
     public static int catSatyety(int min, int max){
         max -= min;
         return (int) (Math.random() * ++max) + min;
     }
     public static void changeSatyety (int foodSatyety){
        satyety = satyety + foodSatyety;
     }
     public static void printSatiety(){
         System.out.println("Уровень сытости " + satyety);
     }
    public static void printDesiredSatiety() {
        System.out.println("Желаемый уровень сытости " + desiredSatiety);
    }
    public static void printState (CatState state){
        switch (state){
            case FED:
                System.out.println("Кот Сыт");
                break;
            case BOSSE:
                System.out.println("Коту пора сесть на диету");
                break;
            case OVERFED:
                System.out.println("Кот перекормлен");
                break;
        }
    }
}
