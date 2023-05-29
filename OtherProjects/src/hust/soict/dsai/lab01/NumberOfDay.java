package hust.soict.dsai.lab01;
import java.util.Scanner;

public class NumberOfDay {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a month: ");
		String m = keyboard.nextLine();
		System.out.println("Enter a year: ");
		int y =keyboard.nextInt();
		if ((m.equals("January"))||(m.equals("Jan."))||(m.equals("Jan"))||(m.equals("1"))||
				(m.equals("March"))||(m.equals("Mar."))||(m.equals("Mar"))||(m.equals("3"))||
				(m.equals("May"))||(m.equals("May."))||(m.equals("May"))||(m.equals("5"))||
				(m.equals("July"))||(m.equals("Jul."))||(m.equals("Jul"))||(m.equals("7"))||
				(m.equals("August"))||(m.equals("Aug."))||(m.equals("Aug"))||(m.equals("8"))||
				(m.equals("October"))||(m.equals("Oct."))||(m.equals("Oct"))||(m.equals("10"))||
				(m.equals("December"))||(m.equals("Dec."))||(m.equals("Dec"))||(m.equals("12"))){
			System.out.println("Day of Month : "+"31");
		} else if (m.equals("February")||m.equals("Feb.")||m.equals("Feb")||m.equals("2")) {
			if (y%400==0) {
				System.out.println("Day of Month: "+"29");
			} else if (y%100==0) {
				System.out.println("Day of Month : "+"28");
			}else if (y%4==0) {
				System.out.println("Day of Month : "+"29");
			}else {
				System.out.println("Day of Month : "+"28");
			}
		}else {
			System.out.println("Day of Month: "+"30");

		}
		}
	}
