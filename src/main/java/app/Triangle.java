// ae vedya
package app;

import java.util.Scanner;

public class Triangle {
	private int a; // side 1
	private int b; // side 2
	private int c; // side 3

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String showType() {
		if (a == b && b == c) {
			return "Equilateral";
		} else if (a == b || a == c || b == c) {
			return "Isosceles";
		} else {
			return "Scalene";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of a: ");
		int a = scanner.nextInt();

		System.out.print("Enter the length of b: ");
		int b = scanner.nextInt();

		System.out.print("Enter the length of c: ");
		int c = scanner.nextInt();

		Triangle t1 = new Triangle(a, b, c);

		System.out.println("Triangle is " + t1.showType());
	}

}