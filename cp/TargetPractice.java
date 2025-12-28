/*
 Problem: Target Practice
 Link: https://codeforces.com/problemset/problem/1873/C

 Approach:
 - The target is a 10x10 grid divided into 5 rings.
 - Each ring gives points from 1 (outermost) to 5 (center).
 - For every 'X', calculate its minimum distance from any border.
 - Points = distance + 1
*/

import java.util.*;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int totalScore = 0;

            for (int i = 0; i < 10; i++) {
                String row = sc.next();
                for (int j = 0; j < 10; j++) {
                    if (row.charAt(j) == 'X') {
                        int distance = Math.min(
                                Math.min(i, j),
                                Math.min(9 - i, 9 - j)
                        );
                        totalScore += distance + 1;
                    }
                }
            }
            System.out.println(totalScore);
        }
        sc.close();
    }
}
