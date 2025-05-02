package com.spring;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<String, Double> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultat = 0;

        System.out.println("=== Calculatrice en Console ===");

        do {
            double nombre1;

            if (!cache.containsKey("resultat")) {
                System.out.print("Entrez le premier nombre : ");
                nombre1 = scanner.nextDouble();
            }else {
                nombre1 = cache.get("resultat");
                System.out.print("\nDernier résultat : " + nombre1 + "\n");
            }

            System.out.print("Choisissez une opération (+, -, *, /) : ");
            char choix = scanner.next().charAt(0);

            System.out.print("Entrez le deuxième nombre : ");
            double nombre2 = scanner.nextDouble();

            switch (choix) {
                case '+':
                    resultat = nombre1 + nombre2;
                    System.out.println("Résultat : " + nombre1 + " + " + nombre2 + " = " + resultat);
                    break;
                case '-':
                    resultat = nombre1 - nombre2;
                    System.out.println("Résultat : " + nombre1 + " - " + nombre2 + " = " + resultat);
                    break;
                case '*':
                    resultat = nombre1 * nombre2;
                    System.out.println("Résultat : " + nombre1 + " * " + nombre2 + " = " + resultat);
                    break;
                case '/':
                    if (nombre2 != 0) {
                        resultat = nombre1 / nombre2;
                        System.out.println("Résultat : " + nombre1 + " / " + nombre2 + " = " + resultat);
                    } else {
                        System.out.println("Résultat : 0");
                    }
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez relancer le programme.");
            }
            cache.put("resultat", resultat);


        } while (true);
    }
}
