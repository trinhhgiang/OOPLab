package hust.soict.dsai.lab01;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = keyboard.nextInt();
		for(int i=1;i<=5;i++) {
				System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1)+" ".repeat(n-i));
			}
		}
	}



