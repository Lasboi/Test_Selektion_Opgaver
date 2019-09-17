package Opgave_4;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {

        //Vi starter en scanner op så vi kan tage imod inputs
        Scanner scanner = new Scanner(System.in);

        //Vi instansiere vores 3 test variabler
        int first;
        int second;
        int third;

        //Fancy besked til konsollen
        System.out.println("**********************************************************");
        System.out.println("*** Dette program kan finde det største tal mellem to ***");
        System.out.println("**********************************************************");

        //Test case A
        //Input: Ukendt, brugeren bestemmer
        //Forventet output: Det største tal skrives ud

        //Input fra brugeren sættes som vores værdier
        System.out.println("");
        System.out.print("Skriv dit første ønskede tal: ");
        first = scanner.nextInt();
        System.out.print("Skriv dit andet ønskede tal: ");
        second = scanner.nextInt();
        System.out.print("Skriv dit tredje ønskede tal: ");
        third = scanner.nextInt();

        //Test kode
        if (first > second && first > third) {
            System.out.print("Det største tal er: ");
            System.out.println(first);
        } else if (second > first && second > third){
            System.out.print("Det største tal er: ");
            System.out.println(second);
        }
        else{
            System.out.print("Det største tal er: ");
            System.out.println(third);
        }
    }
}
