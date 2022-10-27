package tasktwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLetterOfName;

        System.out.println("Vad heter du?");

        firstLetterOfName=scanner.nextLine();

        switch(firstLetterOfName.charAt(0)){

            case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
                    ,'å','ä':
                System.out.println("Namnet börjar på " + firstLetterOfName.charAt(0));
                break;

                case 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'
                        ,'Z','Å','Ä':
                    System.out.println("Namnet börjar på " + firstLetterOfName.charAt(0));
                break;

            case 'Ö','ö':
                System.out.println("Namnet börjar på " + firstLetterOfName.charAt(0) + " och det är den sista " +
                        "bokstaven i alfabetet!");
                break;
            default:
                System.out.println("ogiltig inmatning, försök igen");

        }
    }

}
