import java.util.Scanner;

public class LessenStart {
    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int catSatyety = 0;

        System.out.println("Введите название еды из списка");
        //
        String input = sn.nextLine().toUpperCase();
        Food food = Food.valueOf(input);
        catSatyety = catSatyety + food.getFoodValue();
        System.out.println(catSatyety);
    }
     public static Food getFood(){

     }
}
