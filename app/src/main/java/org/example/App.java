/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.util.Scanner;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stadium monumental = new Stadium("Monumental", 80000, "Lima", true);
        Team peru = new Team("Perú", "Perú");
        Team chile = new Team("Chile", "Chile");
        Player lapadula = new Player("Gianluca Lapadula", new Date(1990, 2, 7), "Turin", "Forward", peru);
        Player sanchez = new Player("Alexis Sánchez", new Date(1988, 12, 19), "Tocopilla", "Forward", chile);

        peru.addPlayer(lapadula);
        sanchez.addPlayer(sanchez);
    }
}

