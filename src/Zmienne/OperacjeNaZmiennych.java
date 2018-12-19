package Zmienne;

/**
 * Created by Rafal Gromek ON 18.12.2018.
 */
public class OperacjeNaZmiennych {

    public static void main (String[] args){

        int x = 15;
        int dzielnik = 7;
        int modulo = x % dzielnik;



        if(modulo == 0) {

            System.out.println("Liczba 7 jest dzielniliem liczby " + x + ".");

        }else if (modulo != 0){

            System.out.println("Liczba 7 nie jest dzielnikiem liczby " + x + ".");
        }

    }
}
