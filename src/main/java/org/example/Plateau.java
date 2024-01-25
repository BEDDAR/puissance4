package org.example;

public class Plateau {
    private int[][] plateau;

    public Plateau() {

    }

    public int[][] initialisationPlateau() {
        var tab = new int[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tab[i][j] = 0;
            }
        }
        return tab;
    }

    public void Affichage(int[][] tab) {

        for (int i = 0; i < tab.length; i++) {
            System.out.print("|");
            for (int j = 0; j < tab[i].length; j++) {
                if(tab[i][j]==1){
                System.out.print("\u001B[31m" + tab[i][j]+"\u001B[0m");
                System.out.print("|");}
                else if(tab[i][j]==2){
                    System.out.print("\u001B[33m" + tab[i][j]+"\u001B[0m");
                    System.out.print("|");}
                else{
                    System.out.print(tab[i][j]);
                    System.out.print("|");}
            }
            System.out.println("");

        }
    }

}
