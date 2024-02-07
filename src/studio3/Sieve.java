package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer n to sift through.");
		int n = in.nextInt();
		int[] array = new int[n];
		int integer = 2;
		for (int i = 0; i < n; i++) {
			array[i] = integer;
			integer++;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i < n; i++) {
			int p = array[i];
			if (array[i] != -1)
			{
			for (int j = array[i]; j < array.length; j = j + array[i]) {
				if (j < array.length) {
					System.out.println(j);
					array[j] = -1;
				}
			}
			}
		}
		for (int i = 0; i < n; i++) {
			if (array[i] > -1) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
