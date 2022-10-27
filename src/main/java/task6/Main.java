package task6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pointsCounter = 0;
        int userInt;


        System.out.println("Hej! Välkommen till frågesporten! Dagens frågor kommer att handla om scrum!");

        Questions.q1();
       String userAnswer = scanner.nextLine();
        if(userAnswer.equalsIgnoreCase("Scrum Master")){
            pointsCounter++;

            System.out.println(pointsCounter);
        } else if (userAnswer.equalsIgnoreCase("Product Owner")){
            pointsCounter++;

        } else if (userAnswer.equalsIgnoreCase("Scrum Team")){
            pointsCounter++;

        }

        Questions.q2();
        userAnswer = scanner.nextLine();
        if(userAnswer.equalsIgnoreCase("Sprint Planering")){
            pointsCounter++;

            System.out.println(pointsCounter);
        } else if (userAnswer.equalsIgnoreCase("Sprint")){
            pointsCounter++;

        } else if (userAnswer.equalsIgnoreCase("Daily Scrum")){
            pointsCounter++;

        } else if (userAnswer.equalsIgnoreCase("Review")){
            pointsCounter++;

        } else if (userAnswer.equalsIgnoreCase("Retro")){
            pointsCounter++;

        }
        Questions.q3();
        userInt = scanner.nextInt();
        if (userInt == 9){
            pointsCounter++;
            System.out.println(pointsCounter);
        }

        Questions.q4();
        userAnswer = scanner.nextLine();
        if (userAnswer == "Backlog"){
            pointsCounter++;

        }

        Questions.q5();
        userAnswer = scanner.nextLine();
        if (userAnswer == "Product Owner"){
            pointsCounter++;

        }

        System.out.println("Poäng: " + pointsCounter);
        if (pointsCounter == 5){
            System.out.println("Grattis full pott!");
        }
            if (pointsCounter < 3){
                System.out.println("Tyvärr du får träna lite mer!");

        }




    }
}
