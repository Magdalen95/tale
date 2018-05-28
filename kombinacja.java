/**
 * Created by Jan on 2018-05-28.
 */
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class kombinacja {

     List lista = new LinkedList<LinkedList<Object>>();
    List listVal = new LinkedList<Integer>();
     List listWeight = new LinkedList<Integer>();
    Map<List,Integer> mapa = new HashMap();
    int lop = 0;
    int lpa = 0;


     void combinationUtil(int val[],int arr[], int n, int r, int index,
                                    int data[], int i)
        {
            if (index == r)
            {
                List temp = new LinkedList();
                for (int j=0; j<r; j++){
                    temp.add(data[j]);
                    lpa=lpa+1;
                }
                    lista.add(temp);
                    lpa=lpa+1;


                return;
            }
            if (i >= n)
                return;

            data[index] = arr[i];
            combinationUtil(val, arr, n, r, index+1, data, i+1);
            combinationUtil(val, arr, n, r, index, data, i+1 );

        }

         void printCombination(int val[], int arr[], int n, int r)
        {
            int data[]=new int[r];
            lpa=lpa+r;
            combinationUtil(val,arr, n, r, 0, data, 0 );
        }
     Integer value( LinkedList list, int val[],int arr[] ){
        Integer wartosc=0;
        Integer weight=0;

            for(int i =0 ; i<list.size(); i++)
            {
                weight=weight+(int)list.get(i);
                for (int j=0;j<arr.length;j++){
                    if((int)list.get(i)==arr[j]){
                        wartosc=wartosc+val[j];
                    }
                }
            }
            listVal.add(wartosc);
            lpa=lpa+1;
            wartosc=0;
            listWeight.add(weight);
            lpa=lpa+1;
            weight=0;

        return 0;
    }

     Integer findBest(int k) {
        int best = 0;
        lpa=lpa+1;
        for (int i = 0; i < lista.size(); i++) {
                        lop=lop+1;
            if ((int) listWeight.get(i) <= k) {
                if ((int) listVal.get(i) > best)
                    best = (int) listVal.get(i);

            }
        }
        return best;
    }
    public  void algorytm (int[] arr, int[] val, int k) {
//            int arr[] = {7,3,9};
//            int val[] = {1,11,8};
//            int k = 9;
            int n = arr.length;
            for (int i=1 ; i<=n; i++)
            { printCombination(val,arr, n, i);
                System.out.println("");
            }
            for (int i=0 ; i<lista.size(); i++){
                System.out.println("");

//                System.out.println("Obiekty:");
//                System.out.println(lista.get(i));
                value((LinkedList)lista.get(i),val,arr);
               // listVal.add(value((LinkedList)lista.get(i),val,arr));
                //System.out.println("Wartości:");
                System.out.println(listWeight.get(i)+"->"+listVal.get(i));
                //System.out.println("Wagi:");
               // listWeight.add(weight((LinkedList) lista.get(i)));
               // System.out.println(listWeight.get(i));

            }
            System.out.println("Wynik:" + findBest(k));
            System.out.println("Zajęta pamiec:" + lpa);
            System.out.println("Liczba opercji :" + lop);



        }
    }

