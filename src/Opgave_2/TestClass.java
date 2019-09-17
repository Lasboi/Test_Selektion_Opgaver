package Opgave_2;

import org.w3c.dom.ls.LSOutput;

public class TestClass {

    public static void main(String[] args) {

        //Variabler der skal testes igennem koden
        int x = 41;
        int y = 67;

        //Test case A
        //Input: x = 41, y = 67
        //Forventet output "Summen er større end 100"

        //Generer output
        String output = testMath(x, y);

        //Test kode
        if (output == "Summen er større end hundrede")
            System.out.println("A: PASS");
        else
            System.out.println("A: FAIL");

        //Nye variable input til den næste test
        x = 1;
        y = 1;

        //Test case B
        //Input: x = 1, y = 1;
        //Forvenete output ""

        //Generere output
        output = testMath(x , y);

        //Test kode
        if (output == "")
            System.out.println("B: PASS");
        else
            System.out.println("B: FAIL");


    }

    //Programkoden som en metode
    static String testMath(int x, int y) {
        int sum = x + y;
        String output = "";

        if (sum > 100)
            output = "Summen er større end hundrede";
        System.out.println(output);
        return output;
    }
}
