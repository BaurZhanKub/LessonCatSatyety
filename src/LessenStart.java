import java.util.Scanner;

public class LessenStart {
    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int catSatyety = 0;

        Food food = getFood();
        catSatyety = catSatyety + food.getFoodValue();
        System.out.println(catSatyety);
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
}
