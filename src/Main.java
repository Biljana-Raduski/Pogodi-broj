import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random(); // Dodala sam klasu Random
        int broj = random.nextInt(10); //Deklarisala sam promenljivu koja je ogranicena do broja 10
        Scanner unos = new Scanner(System.in); // Dodala sam klasu Scanner

        int pogadjanje = 0; // Inicijalizacija promenljive broj. Morala sam da joj dodam vrednost jer je u suprotnom prikazana greska u compile time
                            // Da li mozete da mi objasnite zasto je promenljiva morala da bude inicijalizovana..?

        while (pogadjanje != broj){ // Postavila sam uslov do kada ce se vrteti u petlji, tacnije sve dok "broj" i "pogadjanje nisu jednaki
            System.out.println("Pogodi broj od 1 do 10");
            pogadjanje = unos.nextInt();

            if (pogadjanje == broj){
                System.out.println("Pogodio si broj");
            }else {
                System.out.println("Nisi pogodio broj, pokusaj ponovo");
            }
        }
        unos.close();



    }
}