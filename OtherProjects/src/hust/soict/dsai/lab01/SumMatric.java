package hust.soict.dsai.lab01;
import java.util.Scanner;
public class SumMatric {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Size of matrixs(axb): ");
		int a =input.nextInt();
		int b =input.nextInt();
		int[][] matrix1= new int[a][b];
		int[][] matrix2= new int[a][b];
		System.out.println("Input Matrix 1: ");
		for (int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {
				matrix1[i][j]=input.nextInt();
			}
		}
		System.out.println("Input Matrix 2: ");
		for (int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {
				matrix2[i][j]=input.nextInt();
			}
		}
		System.out.println("Matrix 1: ");
		for (int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix 2: ");
		for (int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of 2 Matrix: ");
		int[][] sum_matrix=new int[a][b];
		for (int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {
				sum_matrix[i][j]=matrix1[i][j]+matrix2[i][j];
				System.out.print(sum_matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
