package BackJun01;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println((a+b)%c);
		System.out.println((a%c)+(b%c));
		System.out.println((a*b)%c);
		System.out.println((a%c)*(b%c));
		
		sc.close();
		
	}

}
