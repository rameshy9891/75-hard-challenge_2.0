package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class GoodBadString {
    /*
     * sample input: sample output: 3 aab ab aaab ab ababa ababa
     */

    public static void main(String[] args) {
        System.out.println("Enter the number of test cases");

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < tc; i++) {
            char[] strArr = sc.nextLine().toCharArray();

            String result = check(strArr);

            System.out.println(result);
        }
        sc.close();
    }

    private static String check(char[] strArr) {
        StringBuilder bag = new StringBuilder();
        int n = strArr.length;

        for (int i = 0; i < n - 1; i++) {
            if (strArr[i] != strArr[i + 1]) {
                bag.append(strArr[i]);
            }
        }
        bag.append(strArr[n - 1]); // Append the last character

        return bag.toString();
    }
}
