package Opgave_1;

import org.w3c.dom.ls.LSOutput;

public class TestClass {
    public static void main(String[] args) {
        //Fælles variabler for alle tests
        int x = 5;
        int y = 8;
        int z = 3;

        //Test case for opgave A
        //Input: x = 5, y = 8, z = 3
        //Forventet output: a == True

        //Program kode
        boolean a = x <= 5 && z != y;

        //Test kode
        if (a == true)
            System.out.println("A: PASS");
        else
            System.out.println("A: FAIL");

        //Test case for opgave B
        //Input: x = 5, y = 8, z = 3
        //Forventet output b == True

        //Program kode
        boolean b = x == 5 || x == y && z == 3;

        //Test kode
        if (b == true)
            System.out.println("B: PASS");
        else
            System.out.println("B: FAIL");

        //Test case for opgave C
        //Input: x = 5, y = 8, z = 3
        //Forventet output: c == false

        //Program kode
        boolean c = x / y > z / x;

        //Test kode
        if (c == false)
            System.out.println("C: PASS");
        else
            System.out.println("C: FAIL");

        //Test case for opgave D
        //Input: x = 5, y = 8, z = 3
        //Forventet output: d == false

        //Programkode
        boolean d = !( x != y - z ) == false;

        //Test kode
        if (d == false)
            System.out.println("D: PASS");
        else
            System.out.println("D: FAIL");

        //Test case for opgave E
        //Input: x = 5, y = 8, z = 3
        //Forventet output: e == true

        //Programkode
        boolean e = 2 * x != x || x == 0;

        //Test kode
        if (e == true)
            System.out.println("E: PASS");
        else
            System.out.println("E: FAIL");

        //Test case for opgave F
        //Input: x = 5, y = 8, z = 3
        //Forventet output: f == true

        //Programkode
        boolean f = ! true || ! false;

        //Test kode
        if (f == true)
            System.out.println("F: PASS");
        else
            System.out.println("F: FAIL");
    }
}
