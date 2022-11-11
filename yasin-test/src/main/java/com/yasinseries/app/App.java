package com.yasinseries.app;


import static java.lang.Thread.sleep;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        int i = 0;
        while (i <= 10000) {
            System.out.println(i);
            i++;
            sleep(1);
        }
        System.out.println("CONGRATULATIONS");
    }
}
