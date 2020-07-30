/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval;

import java.awt.Event;
import java.util.Scanner;

/**
 *
 * @author Thierry
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nli, ncol, n;
        //tableau a 1 dimension
        System.out.println("Saisir le nombre de ligne du tableau");
        nli = reader.nextInt();

        int[] tab = getTab(nli);

        System.out.println("Saisir une valeur a chercher");
        n = reader.nextInt();

        System.out.println("Pour la valeur " + n + " la fonction retourne " + nbOccurences(tab, n));

        //tableau a 2 dimensions
        System.out.println("Saisir le nombre de ligne du tableau");
        nli = reader.nextInt();
        System.out.println("Saisir le nombre de col du tableau");
        ncol = reader.nextInt();

        System.out.println("Saisir une valeur a chercher");
        n = reader.nextInt();

        int[][] tab2 = getTab(nli, ncol);

        System.out.println("Pour la valeur " + n + " la fonction retourne " + n + " la fonction retourne " + nbOccurences(tab2, n));
    }

    public static int[] getTab(int nli) {
        Scanner reader = new Scanner(System.in);
        int[] tab = new int[nli];
        for (int i = 0; i < nli; i++) {
            System.out.println("Saisir une valeur");
            tab[i] = reader.nextInt();

        }
        return tab;

    }

    public static int nbOccurences(int[] tab, int n) {
        int somme = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == n) {
                somme++;
            }

        }
        return somme;

    }

    public static int[][] getTab(int nli, int ncol) {
        Scanner reader = new Scanner(System.in);

        int[][] tab = new int[nli][ncol];
        for (int i = 0; i < nli; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.println("Saisir une valeur");
                tab[i][j] = reader.nextInt();
            }

        }
        return tab;

    }

    public static int nbOccurences(int[][] tab, int n) {
        int somme = 0;
        int nli = tab.length;
        int ncol = tab[0].length;
        for (int i = 0; i < nli; i++) {
            for (int j = 0; j < ncol; j++) {
                if (tab[i][j] == n) {
                    somme++;
                }

            }

        }
        return somme;

    }
}
