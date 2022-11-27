import java.util.Random;
import java.util.Scanner;

public class LessenStart {
    static Scanner sn = new Scanner(System.in);
    static Random rn = new Random();
    public static void main(String[] args) {
        printFood();
        Food food = getFood();
        int satyety = catSatyety(10,100);
        satyety = satyety + food.getFoodValue();
        System.out.println(satyety);
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
             System.out.printf("%s, %s",food.name(),food.getFoodValue());
         }
         System.out.println();
     }
     public static int catSatyety(int min, int max){
        int  rand = Math.max(min,max)+min;
       return rand;
     }
}
