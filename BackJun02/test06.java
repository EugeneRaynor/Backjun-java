package BackJun02;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하시오");
		int a = sc.nextInt();
		System.out.println("b를 입력하시오");
		int b = sc.nextInt();
		System.out.println("c를 입력하시오");
		int c = sc.nextInt();
		sc.close();
		
		if(a==b&&a==c) {
			System.out.println(10000 + (a*1000));
		} else if (a==b) {
			System.out.println(1000 + (a*100));
		} else if (a==c) {
			System.out.println(1000 + (a*100));
		} else if (b==c) {
			System.out.println(1000 + (b*100));
		} else {
			if(a>b && a>c) {
				System.out.println(a*100);
			}else if(b>a && b>c) {
				System.out.println(b*100);
			}else if(c>a && c>b){
				System.out.println(c*100);
			}
		}

	}

}
