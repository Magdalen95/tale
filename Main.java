/**
 * Created by Jan on 2018-05-21.
 */
import sun.util.resources.cldr.naq.CalendarData_naq_NA;

import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int p,lad;
        algHeurystyczny algHeurystyczny= new algHeurystyczny();
        kombinacja kombinacja = new kombinacja();
        int[] w1={1,2,3};
        int[] val1={4,5,6};
        int lad1=4;
        int[] w2={4,11,15,13,12,18,3};
        int[] val2={5,3,8,6,1,17,9};
        int lad2=58;
        int[] w3={3,4,7,8,5,6,1,9,10,11,12,14,16,19};
        int[] val3={2,3,4,5,6,8,1,9,13,14,15,11,15,17};
        int lad3=80;

        for(;;){
        System.out.println("Który zbiór wartości chcesz wybrać: \n");
        System.out.println("1) \n" );
        for ( int i=0 ; i <w1.length;i++)
        {
            System.out.println(w1[i]+ "-> " + val1[i]);
        }
        System.out.println("2) \n" );
        for ( int i=0 ; i <w2.length;i++)
        {
            System.out.println(w2[i]+ "-> " + val2[i]);
        }
        System.out.println("3) \n" );
        for ( int i=0 ; i <w3.length;i++)
        {
            System.out.println(w3[i]+ "-> " + val3[i]);
        }


        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        p = Integer.parseInt(odczyt.nextLine());

       if(p==1)
           { algHeurystyczny.algorytm(w1,val1,lad1);
               kombinacja.algorytm(w1,val1,lad1);}
        else if (p==2){  algHeurystyczny.algorytm(w2,val2,lad2);
               kombinacja.algorytm(w2,val2,lad2);}
       else if (p==3)
           { algHeurystyczny.algorytm(w3,val3,lad3);
               kombinacja.algorytm(w3,val3,lad3);}
        else
           {System.out.println("Zart dla Prowadzącego : Programista otwiera lodówkę, sięga po masło i patrząc na napis „82%” mówi:\n" +
                       "– a to jeszcze chwilka i będzie gotowe");
           }
            System.out.println("chcesz sprobowac jeszcze raz?\n1-tak\n2-nie");
            int check = Integer.parseInt(odczyt.nextLine());
            if (check==2) break;
        }

    }

//        System.out.println("Podaj ilosc wartosci: \n");
//        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
//        n = Integer.parseInt(odczyt.nextLine());
//
//        int[] w= new int[n];
//        int[] val= new int[n];
//
//        System.out.println("Podaj ładowność plecaka: \n");
//        Scanner ladownosc = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
//        lad = Integer.parseInt(ladownosc.nextLine());
//
//        for ( int i = 0; i<n; i++) {
//
//            System.out.println("Podaj wagę: \n");
//            Scanner wartosci = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
//            w[i] = Integer.parseInt(wartosci.nextLine());
//
//            System.out.println("Podaj wartość: \n");
//            Scanner waga = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
//            val[i] = Integer.parseInt(waga.nextLine());

//        }
//
//        for ( int i = 0; i<n; i++) {
//            System.out.println(" Podana waga " + w[i]+ " podana wartość "+val[i] ); //wyświetlamy powitanie
//        }



    }

