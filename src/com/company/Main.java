package com.company;

import java.util.Scanner;

public class Main {
    public static final int ILE_ELEMENTOW = 10;
    public static int[] tablica = new int[ILE_ELEMENTOW];

    private static void wczytajTablice(){
        Scanner daneWejsciowe = new Scanner(System.in);
        for (int i = 0; i < ILE_ELEMENTOW ; i++) {
            System.out.print("Podaj element " + (i+1) + " element tablicy: ");
            tablica[i] = daneWejsciowe.nextInt();
        }
    }

    public static void main(String[] args) {
	    wczytajTablice();
	    SortowanieWybieranie sortowanieWybieranie = new SortowanieWybieranie(tablica);
        sortowanieWybieranie.sortujRosnaco();
        System.out.println(sortowanieWybieranie.toString());

        sortowanieWybieranie.sortujMalejaco();
        System.out.println(sortowanieWybieranie.toString());
    }
}
