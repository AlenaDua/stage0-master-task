package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
            for (int i = 1; i <= cathetusLength; i++) {
                for (int j = 1; j <= cathetusLength; j++) {
                    if (i + j < cathetusLength + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }

        }


    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
