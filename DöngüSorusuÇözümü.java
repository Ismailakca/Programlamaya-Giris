package org.csystem.app;

import java.util.Scanner;

class App{
    public static void main(String [] args)
    {
        sayi.run();
    }
}

class sayi{
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        int a =Integer.parseInt(kb.nextLine());
        int b =Integer.parseInt(kb.nextLine());
        int avg = 0;
        int sum = 0;
        int tek = 0;

        if( a > b ){
            for (int i = b; i < a ; ++i ) {
                if (!isEven(i)) {
                    sum += i;
                    ++tek;
                }
            }
            avg = sum / tek;
            System.out.println(avg);
        }

        else if( b > a ){
            for (int i = a; i < b ; ++i ) {
                if (!isEven(i)) {
                    sum += i;
                    ++tek;
                }
            }
            avg = sum / tek;
            System.out.println(avg);

        }

        else{
        System.out.println("Lütfen eşit sayi girmeyiniz..");
        run();
    }
    }
    public static boolean isEven(int val)
    {
        return val % 2 == 0;
    }
}
