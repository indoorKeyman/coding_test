package _11660;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[n+1][n+1];
        int [][] arr2 = new int[n+1][n+1];

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                arr2[i][j] = arr2[i][j-1] + arr2[i-1][j] - arr2[i-1][j-1] + arr[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int result = arr2[x2][y2] - arr2[x1-1][y2] - arr2[x2][y1-1] + arr2[x1-1][y1-1];
            System.out.println(result);
        }


    }


}
