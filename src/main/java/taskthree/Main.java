package taskthree;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Person person = new Person();
        ArrayList<Person> people = new ArrayList<>();


        int userInput;
        do {
            Menu.menu();
            userInput = Integer.parseInt(scanner.nextLine());
            switch (userInput) {
                case 9:
                    System.out.println("Ange förnamn på din person");
                    String personTempFirstName = scanner.nextLine();


                    System.out.println("Ange efternamn på din person");
                    String personTempLastName = scanner.nextLine();


                    System.out.println("Ange favoritfilm på din person");
                    String personTempFavouriteMovie = scanner.nextLine();


                    Person personTemp = new Person(personTempFirstName, personTempLastName, personTempFavouriteMovie);
                    people.add(personTemp);
                    break;
                case 1:
                    for (Person n : people) {
                        System.out.println((n));
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }

        } while(userInput !=0);


    }
}
