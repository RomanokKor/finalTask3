package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите кол-во строк");
        Scanner s = new Scanner(System.in);

        int countRows = s.nextInt();
        s.nextLine();
        long maxDistinctChars = 0;
        String[] rowsArr = new String[countRows];

        int rowNumWithMaxDistinctChars = 0;

        for (int i = 0; i < countRows; i++) {

            System.out.println("Введите значение строки " + (i + 1));
            rowsArr[i] = s.nextLine();

            long distinctChars = countDistinctChars(rowsArr[i]);

            if (maxDistinctChars < distinctChars) {

                maxDistinctChars = distinctChars;

                rowNumWithMaxDistinctChars = i;
            }
        }

        System.out.println(rowsArr[rowNumWithMaxDistinctChars]);

    }

    private static long countDistinctChars(String row) {
        return row.chars().distinct().count();
    }
}
