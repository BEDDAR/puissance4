package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Plateau plateau = new Plateau();
        int[][] tab = plateau.initialisationPlateau();
        Joueur joueur1 = new Joueur("joueur1", new Piece().ROUGE);
        Joueur joueur2 = new Joueur("joueur2", new Piece().JAUNE);
        Coup coup = new Coup();
        int i = 1;
        Boolean isVictoire = false;
        while (i <= 42 && !isVictoire) {
            i++;
            coup.jouer(tab, joueur1);
            isVictoire = joueur1.victoire(tab);
            System.out.println("joueur1 a gagné ?" + isVictoire);
            if (isVictoire) {
                return;
            }
            coup.jouer(tab, joueur2);
            isVictoire = joueur2.victoire(tab);
            System.out.println("joueur2 a gagné ?" + isVictoire);
        }
    }
}
