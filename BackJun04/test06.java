package BackJun04;

import java.util.Arrays;
import java.util.Scanner;

class Avg {
	int seto; // 학생 수

	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 개수");
		int C1 = sc.nextInt();

		int avg = 0;
		for (int i = 0; i < C1; i++) {
			int sum = 0; // 값

			int seto = sc.nextInt();
			int arr[] = new int[seto];
			for (int j = 0; j < seto; j++) {
				arr[j] = sc.nextInt();

				sum += arr[j]; // 총합
			}
			avg = sum / seto;
			System.out.println(avg);
		}
		return avg;

	}

	public void process() {

	}
}

public class test06 {

	public static void main(String[] args) {
		Avg a = new Avg();
		a.input();

	}

}
