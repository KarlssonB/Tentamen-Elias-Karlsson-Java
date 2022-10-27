package taskone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLetterOfName;

        System.out.println("Vad heter du?");
        firstLetterOfName = scanner.nextLine();

            if (firstLetterOfName == null) {
                System.out.println("Vad heter du?");
            } else {
                if (firstLetterOfName.charAt(0) == 'Ö') {
                    System.out.println("Namnet börjar på " + firstLetterOfName.charAt(0) + " och det är den sista " +
                            "bokstaven i alfabetet!");
                } else if (firstLetterOfName.charAt(0) != 'Ö')
                    System.out.println("Namnet börjar på " + firstLetterOfName.charAt(0));

            }


    }
}
