package org.syncro.matrix;

public class App {

	private static final int LENGTH = 9;

	public static void main(String[] args) {
		int[][] matrix = new int[LENGTH][LENGTH];

		for (int i = 0; i < LENGTH; i++) {
			for (int j = 0; j < LENGTH; j++) {
				matrix[i][j] = i * LENGTH + j +10;
			}
		}

		for (int i = 0; i < LENGTH / 2; i++) {
			for (int j = i + 1; j < LENGTH - 1 - i; j++) {
				matrix[LENGTH - 1 - i][j] = matrix[i][j];
			}
		}

		for (int j = 0; j < LENGTH / 2; j++) {
			for (int i = j + 1; i < LENGTH - 1 - j; i++) {
				matrix[i][LENGTH - 1 - j] = matrix[i][j];
			}
		}
		
		for (int i = 0; i < LENGTH; i++) {
			for (int j = 0; j < LENGTH; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
