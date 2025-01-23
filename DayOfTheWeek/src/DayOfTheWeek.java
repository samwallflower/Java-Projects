
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Hello");

       Scanner sc = new Scanner(System.in);
       Scanner sc2 = new Scanner(System.in);
       System.out.println("Give a day: ");
        String day = sc2.nextLine().toUpperCase();
        switch(day){
            case ("SUNDAY"), ("SATURDAY"):
                System.out.println("Week-End");
                break;


            case ("MONDAY"),("TUESDAY"),("WEDNESDAY"),("THURSDAY"),("FRIDAY"):
                System.out.println("Weekday");
                break;


        }

        System.out.println("Give a number: ");
        int a = sc.nextInt();
        if(a<=1) System.out.println("Please give a number greater than 1 ");
        else {
            int i = 2;
            for (; i != a; i++) {

                if(a%i == 0) {
                    System.out.println("Not a prime!");
                    break;
                }

            }
             if(i==a) System.out.println(a + " is a prime");

        }








    }
}
