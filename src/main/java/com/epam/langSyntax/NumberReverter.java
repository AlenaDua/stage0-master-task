package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int number1 = number / 100;
        int number2 = (number % 100) / 10;
        int number3 = number % 10;

        System.out.printf("%d%d%d\n", number3, number2, number1);
    }

}
