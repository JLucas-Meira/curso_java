package exercicios_curso_java.arrays_listas.projetos.pensionato.application;

import exercicios_curso_java.arrays_listas.projetos.pensionato.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("Quantos quartos serão alugados?");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++){
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
