import java.util.Scanner;

public class algHeurystyczny {

    public static void main(String args[]) {

                int n,lad;

                System.out.println("Podaj ilosc wartosci: \n");
                Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
                n = Integer.parseInt(odczyt.nextLine());

                int[] w= new int[n];
                int[] val= new int[n];

                System.out.println("Podaj ładowność plecaka: \n");
                Scanner ladownosc = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
                lad = Integer.parseInt(ladownosc.nextLine());

                for ( int i = 0; i<n; i++) {

                    System.out.println("Podaj wagę: \n");
                    Scanner wartosci = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
                    w[i] = Integer.parseInt(wartosci.nextLine());

                    System.out.println("Podaj wartość: \n");
                    Scanner waga = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
                    val[i] = Integer.parseInt(waga.nextLine());

                }

//        waga podanych elementów
//        int[] w = {2,5,6};
//
//        wartości kolejnych elementów
//        int[] v = {10,20,30};
//
//        ładowność plecaka
//        int b = 10;

        for ( int i = 0; i<n; i++) {
            System.out.println(" Podana waga " + w[i]+ " podana wartość "+val[i] ); //wyświetlamy powitanie
        }

        System.out.print(algorytm(w,val,lad));

    }

    public static int algorytm(int[] w, int[] v, int b) {

        //licznik operacji
        int lop =0;
        // ilość podanych elementów
        int l = w.length;

        // tablica o rozmiarach l+1 - ilość podanych elementów, b- ładowność plecaka
        int[][] tablica = new int[l + 1][b + 1];


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

                if (w[item - 1] <= weight) {
                    tablica[item][weight] = Math.max(v[item - 1] + tablica[item - 1][weight - w[item - 1]], tablica[item - 1][weight]);
                lop=lop+1;
                }
                else {
                    tablica[item][weight]=tablica[item-1][weight];
                lop=lop+1;
                }
                }
            }
        for (int[] rows : tablica) {
            for (int kol : rows) {
                System.out.format("%5d", kol);
            }
            System.out.println();
        }
        return tablica[l][b];

        }
    }


