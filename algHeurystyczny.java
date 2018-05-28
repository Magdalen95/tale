import java.util.Scanner;

public class algHeurystyczny {


    //licznik operacji
    int lop =0;
    int lpa= 0;

    public void algorytm(int[] w, int[] v, int b) {



        // ilość podanych elementów
        int l = w.length;

        // tablica o rozmiarach l+1 - ilość podanych elementów, b- ładowność plecaka
        int[][] tablica = new int[l + 1][b + 1];
        lpa=b+1+l+1;

        for (int kol = 0; kol <= b; kol++) {
            tablica[0][kol] = 0;

        }

        for (int row = 0; row <= l; row++) {
            tablica[0][row] = 0;
        }

        //obliczanie kolejnych wartości sum wartości elementów oraz wagi
        // wybór maksymalnej wartości
        for (int item = 1; item <= l; item++) {

            for (int weight = 1; weight <= b; weight++) {
                lop=lop+1;
                if (w[item - 1] <= weight) {
                    tablica[item][weight] = Math.max(v[item - 1] + tablica[item - 1][weight - w[item - 1]], tablica[item - 1][weight]);

                }
                else {
                    tablica[item][weight]=tablica[item-1][weight];

                }
                }
            }
        for (int[] rows : tablica) {
            for (int kol : rows) {
                System.out.format("%5d", kol);
            }
            System.out.println();
        }

        System.out.println(tablica[l][b]);

        System.out.println("Licza operacji " + lop);
        System.out.println("Zajeta pamiec " + lpa);
    }

    }


