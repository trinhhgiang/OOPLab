package hust.soict.dsai.lab01;
import java.util.Scanner;
import java.util.Arrays;
public class SortArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Size of array : ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
        System.out.print("Input array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("Sorted array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int sum=0;
        for (int num:arr) {
        	sum+=num;
        }
        System.out.println("Sum of array : "+sum);
        double a=0;
        a=(double)sum/(double)arr.length;
        System.out.println("Average value of array : "+a);
        
    }
}
