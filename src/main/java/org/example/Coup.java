package org.example;

import java.util.Scanner;

public class Coup {
    Plateau plateau = new Plateau();

    public void jouer(int[][] tab, Joueur joueur) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(joueur.getNom() + " Entrez un numéro de colonne ");
        int positionY1 = scanner.nextInt();
        tab = joueur.placementJeton(positionY1, joueur.getPiece(), tab);
        plateau.Affichage(tab);

    }
}

