package org.itstep.cikl;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /* Цикл фор
       for (int i = 0; i<10; i ++){
            System.out.println("И равна =" + i);
        } */


       /* Цикл вайл
        int i = 0;
        while (i < 10) {
            System.out.println("И равна = " + i);
            i++;
        } */

        //Вложенный фор
        /*
       for(int i = 0; i< 10; i++) {

           for (i = 0; i < 10; i++) {
               System.out.println(" Первый цикл " + i + ", второй цикл =" + i);
           } */

        // Вложенные циклы
        /*
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println(" Первый цикл " + i + ", второй цикл =" + j);
            }
        }


        */ // вывод нечетных чисел
        // Задание1
        /*
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                {
                    System.out.println("И равна =" + i);
                }
            }
        }

        */
/* Задание 2
        Scanner scanner = new Scanner (System.in);
        int n ;
        int f = 1;
        n = scanner.nextInt();
        for (int i=1; i<=n; i++){
        f=f*i;
        System.out.println(f);
             }
    }
*/

        /* Вывод результатов при помощи while
        Scanner scanner = new Scanner (System.in);
        int result = 25;
        do {
            System.out.println("Введите число 25");
            result = scanner.nextInt();
            if(result == 25){
                break;
            }
        }
        while (true);
        System.out.println("Вы че"); */


// Задание 3
// Перетащите программы из заданий задания 1 и 2 при помощи цикла while
/*
        int i = 0;
        while (i <= 99) {
            if (i % 2 != 0) {
                System.out.println("И равна = " + i);
            }
            i++;
        }
    }
}
*/
       /* Scanner scanner = new Scanner (System.in);
        int n ;
        int f = 1;
        n = scanner.nextInt();
        for (int i=1; i<=n; i++){
            f=f*i;
            System.out.println(f);
        }
        for (int i = 0; i<10; i ++){

        }
        int i = 0;
        while (i < 10) {
            System.out.println("И равна = " + i);
            i++;*/

        Scanner scanner = new Scanner (System.in);
        int n = 0 ;
        int i = 1;
        n = scanner.nextInt();
        while (i<=n);
        System.out.println(i);
            i++;
        }
    }

