import java.util.Random;
import java.util.Scanner;

public class LessenStart {
    static Scanner sn = new Scanner(System.in);
    static Random rn = new Random();
    static int satyety = catSatyety(10,100);
    static int desiredSatiety = catSatyety(10,200);
    public static void main(String[] args) {
        printFood();
        printDesiredSatiety();
        while (satyety<desiredSatiety){
            if (satyety== desiredSatiety){
                System.out.println("Кот сыт ");
                break;
            }
            printSatiety();
            Food food = getFood();
            changeSatyety(food.getFoodValue());
            printDesiredSatiety();
        }
        System.out.println("Выш кот перекормлен");
        printSatiety();
    }
     public static Food getFood(){
         System.out.println("Введите название еды из списка");
         String input = sn.nextLine().toUpperCase();
         for (Food food : Food.values()) {
             if(food.name().equals(input)){
                 return food;
             }
         }
         System.out.println("Вы ввели неверные данные!");
         return getFood();
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
}
