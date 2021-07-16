import java.util.Scanner;

public class homework_lesson_6 {
    public static void main(String[] args) {

        //Program that shows different greetings if time is known


        int time = 8;

        int year = 2021;
        int month = 7;
        int day = 16;


        //smaller than 12
        if (time < 12 && time >= 0) {
            System.out.println("Good Morning Sunshine!");

            //between 13 - 19
        } else if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon. Work Hard!");
            // between 20-24
        } else if (time >= 20 && time < 24) {
            System.out.println("Good Evening. Get some rest!");
        } else {
            System.out.println("The time is incorrect.");
        }


        if (day < 1 || day > 31) {
            System.out.println("Incorrect date value.");
        } else if (month < 1 || month > 12) {
            System.out.println("Incorrect month value.");
        }
        // not stated if future years should not be allowed
        else if (year < 1) {
            System.out.println("Incorrect year value.");
        } else {
            System.out.println(year + "/" + month + "/" + day);
        }


    }
}
