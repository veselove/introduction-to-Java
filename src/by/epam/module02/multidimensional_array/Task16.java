package by.epam.module02.multidimensional_array;

import java.util.Scanner;

/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., 2^n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.Пример магического квадрата порядка 3:
                                          6 1 8
                                          7 5 3
                                          2 9 4
 */

public class Task16 {

	public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter again >> ");
		}
        
        int n = sc.nextInt();
        
        if (n % 2 != 0) oddMagicSquare(n);
        if (n % 2 == 0) evenMagicSquare(n);        
    }
	
    private static void oddMagicSquare(int n) {
    	
        int[][] arr = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;
        
        while (number <= n * n) {
            arr[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (arr[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
        
        showArray(arr);
    }
    
    private static void evenMagicSquare(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++)
                arr[i][j] = (n*i) + j + 1;
        }
        
        for (int i = 0; i<n/4; i++) {
            for (int j = 0; j<n/4; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];
        }
        
        for (int i = 0; i< n/4; i++) {
            for (int j = 3* (n/4); j<n; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];
        }
        
        for (int i = 3* n/4; i<n; i++) {
            for (int j = 0; j<n/4; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];
        }
        
        for (int i = 3* n/4; i<n; i++) {
            for (int j = 3* n/4; j<n; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];
        }
        
        for (int i = n/4; i<3* n/4; i++) {
            for (int j = n/4; j<3* n/4; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];
        }
        
        showArray(arr);
    }
    
    private static void showArray (int[][] magicSquare) {
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }

	}

}
