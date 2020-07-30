/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval;

import java.util.Scanner;

/**
 *
 * @author Thierry
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String msg;

        //test fonction estPalindrome()
        System.out.println("Saisir un mot");
        msg = reader.nextLine();
        System.out.println(estPalindrome(msg) ? "c'est un palindrome" : "ce n'est pas un palindrome");

        //test fonction nbPld()
        System.out.println("Saisir le nombre de mot ds le tableau");
        int n = reader.nextInt();
        String[]tab=getTab(n);
        System.out.println("le nombre de palindrome ds le tableau est: "+nbPld(tab));
    }

    public static boolean estPalindrome(String string) {
        int n = string.length();
        for (int i = 0; i < n / 2; i++) {
            if (string.charAt(i) == string.charAt(n - i - 1)) {
                return true;
            }
        }
        return false;
    }

    public static String[] getTab(int n) {
        Scanner reader = new Scanner(System.in);
        String[] tab = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Veuillez saisir un mot");
            tab[i] = reader.nextLine();

        }
        return tab;
    }

    public static int nbPld(String[] tab) {
        int somme = 0;
        
        for (int i = 0; i < tab.length; i++) {
            if(estPalindrome(tab[i]))
                somme++;
        }
            
        
        return somme;
    }
}