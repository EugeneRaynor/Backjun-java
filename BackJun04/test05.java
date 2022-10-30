package BackJun04;

import java.util.Scanner;

class Input {
	int sum;

	public String[] input() {
		System.out.println("시험 수");
		Scanner sc1 = new Scanner(System.in);
		int N1 = sc1.nextInt();
		String arr1[] = new String[N1];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc1.next();
		}
		sc1.close();
		return arr1;
	}

	public void process(String pr[]) {
		for (int i = 0; i < pr.length; i++) {
			int count = 0;
			int sum = 0;

			for (int j = 0; j < pr[i].length(); j++) {
				if (pr[i].charAt(j) == 'O') {
					count++;
					sum += count;
				} else {
					count = 0;
				}

			}
			System.out.println(sum);

		}

	}

}

public class test05 {
	public static void main(String[] args) {
		Input in = new Input();
		String pr[] = in.input();
		in.process(pr);
	}

}
