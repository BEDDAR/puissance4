package org.example;

import java.util.Scanner;

public class Joueur {
    private String nom;
    private int piece;
    public Joueur() {
           }
    public Joueur(String nom,int piece) {
        this.nom = nom;
        this.piece=piece;

    }

    public String getNom() {
        return nom;
    }

    public int getPiece() {
        return piece;
    }

    public int[][] placementJeton(int positionY, int numero, int[][] tab) {
        Boolean isPlaced = false;
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        while (tab[i + 1][positionY] == 0 && i < 4) {
            i++;
        }
        ;
        if (tab[5][positionY] == 0) {
            i = 5;
        }
        if (i >= 0) {
            tab[i][positionY] = numero;
            isPlaced = true;
        } else {
            System.out.println("Entrez une autre position, colonne plaine");
            positionY = scanner.nextInt();
            placementJeton(positionY, numero, tab);
        }
        return tab;
    }

    public Boolean victoire(int[][] tab) {
        Boolean isVictoire = false;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                //vérification de lignes
                if (tab[i].length - j > 3) {
                    if (tab[i][j] == tab[i][j + 1] && tab[i][j] == tab[i][j + 2] && tab[i][j] == tab[i][j + 3] && tab[i][j] != 0) {
                        isVictoire = true;
                        return isVictoire;
                    }
                }
            }
        }
        for (int j = 0; j < tab[0].length; j++) {
            for (int i = 0; i < tab.length; i++) {
                //vérification de colonnes
                if (tab.length - i > 3) {
                    if (tab[i][j] == tab[i + 1][j] && tab[i][j] == tab[i + 2][j] && tab[i][j] == tab[i + 3][j] && tab[i][j] != 0) {
                        isVictoire = true;
                        return isVictoire;
                    }
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                //vérification de diagonale on commençant par le haut et à gauche
                if (tab.length - i > 3 && tab[i].length - j > 3) {
                    if (tab[i][j] == tab[i + 1][j + 1] && tab[i][j] == tab[i + 2][j + 2] && tab[i][j] == tab[i + 3][j + 3] && tab[i][j] != 0) {
                        isVictoire = true;
                        return isVictoire;
                    }
                }
            }
        }
        for (int i = tab.length - 1; i >= 0; i--) {
            for (int j = tab[i].length - 1; j >= 0; j--) {
                //vérification de diagonale on commençant par le bas et à droite
                if (tab.length - i < 4 && tab[i].length - j < 5) {
                    if (tab[i][j] == tab[i - 1][j - 1] && tab[i][j] == tab[i - 2][j - 2] && tab[i][j] == tab[i - 3][j - 3] && tab[i][j] != 0) {
                        isVictoire = true;
                        return isVictoire;
                    }
                }
            }
        }
        for (int i = tab.length - 1; i >= 0; i--) {
            for (int j = 0; j < tab[i].length; j++) {
                //vérification de diagonale on commençant par le bas et à gauche
                if (tab.length - i < 4 && tab[i].length - j >3) {
                    if (tab[i][j] == tab[i - 1][j + 1] && tab[i][j] == tab[i - 2][j + 2] && tab[i][j] == tab[i - 3][j + 3] && tab[i][j] != 0) {
                        isVictoire = true;
                        return isVictoire;
                    }
                }
            }
        }
        for (int i = 0; i <tab.length; i++) {
            for (int j = tab[i].length - 1; j >= 0; j--) {
                //vérification de diagonale on commençant par le haut et à droite
                if (tab.length - i >3 && tab[i].length - j < 5) {
                    if (tab[i][j] == tab[i + 1][j - 1] && tab[i][j] == tab[i + 2][j - 2] && tab[i][j] == tab[i + 3][j - 3] && tab[i][j] != 0) {
                        isVictoire = true;
                        return isVictoire;
                    }
                }
            }
        }
        return isVictoire;
    }
}
