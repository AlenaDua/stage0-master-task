package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            {
                sum = i * numberTableToPrint;

                System.out.print(i + " x " + numberTableToPrint + " = " + sum);
                System.out.println();

            }
        }
    }

}
