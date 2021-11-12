package com.company;

import java.util.Arrays;

public class SortowanieWybieranie {
    private final static int LICZBA_ELEMENTOW = 10;
    private int[] tablica = new int[LICZBA_ELEMENTOW];

    /********************************************************
     * nazwa funkcji: SortowanieWybieranie
     * parametry wejściowe: tablica - przxechowuje tablicę liczb całkowitych do posortowania
     * wartość zwracana: brak
     * opis: konstruktor klasy
     * autor: 01234567890
     * ****************************************************/
    public SortowanieWybieranie(int[] tablica) {
        this.tablica = tablica;
    }

    /********************************************************
     * nazwa funkcji: znajdzNajmniejsza
     * parametry wejściowe: indeks - indeks tabeli, od którego
     *                      wyszukujemy wartość najmniejszą w tablicy
     * wartość zwracana: indeks najmniejszego elementu tablicy
     * autor: 01234567890
     * ****************************************************/
    private int znajdzNajmniejsza(int indeks){
        int indeksNajmniegoElementu = indeks;
        for (int i = indeks+1; i < LICZBA_ELEMENTOW; i++) {
            if(this.tablica[indeksNajmniegoElementu]> this.tablica[i]){
                indeksNajmniegoElementu = i;
            }
        }
        return indeksNajmniegoElementu;
    }
    /********************************************************
     * nazwa funkcji: znajdzNajwieksza
     * parametry wejściowe: indeks - indeks tabeli, od którego
     *                      wyszukujemy wartość najwiekszą w tablicy
     * wartość zwracana: indeks największego elementu tablicy
     * autor: 01234567890
     * ****************************************************/
    private int znajdzNajwieksza(int indeks){
        int indeksNajwiekszegoElementu = indeks;
        for (int i = indeks+1; i < LICZBA_ELEMENTOW; i++) {
            if(this.tablica[indeksNajwiekszegoElementu]< this.tablica[i]){
                indeksNajwiekszegoElementu = i;
            }
        }
        return indeksNajwiekszegoElementu;
    }

    /********************************************************
     * nazwa funkcji: zamien
     * parametry wejściowe: indeks1, indeks2 - indeksy zamienianych elementó tablicy
     * wartość zwracana: brak
     * opis: zamienia dwa elementy tablicy o indeksach wskazanych w parametrach
     * autor: 01234567890
     * ****************************************************/
    private void zamien(int indeks1, int indeks2){
        int temp  = this.tablica[indeks2];
        this.tablica[indeks2] = this.tablica[indeks1];
        this.tablica[indeks1] = temp;
    }

    /********************************************************
     * nazwa funkcji: sortujRosnąco
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sortuje tbalicę w porządku rosnącym
     * autor: 01234567890
     * ****************************************************/
    public void sortujRosnaco(){
        for (int i = 0; i <LICZBA_ELEMENTOW-1; i++) {
            int indeksNajmniejszej = znajdzNajmniejsza(i);
            zamien(i, indeksNajmniejszej);
        }
    }

    /********************************************************
     * nazwa funkcji: sortujMalejaco
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sortuje tbalicę w porządku malejącym
     * autor: 01234567890
     * ****************************************************/

    public void sortujMalejaco(){
        for (int i = 0; i <LICZBA_ELEMENTOW-1; i++) {
            int indeksNajwiekszej = znajdzNajwieksza(i);
            zamien(i, indeksNajwiekszej);
        }
    }

    /********************************************************
     * nazwa funkcji: toString
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: wypisuje zawrtość tablicy
     * autor: 01234567890
     * ****************************************************/
    @Override
    public String toString() {
        return "Wynik sortowania: " +
                "tablica=" + Arrays.toString(tablica);
    }
}
