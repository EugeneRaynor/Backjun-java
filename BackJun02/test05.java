package BackJun02;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시간");
		int a = sc.nextInt();
		System.out.println("분");
		int b = sc.nextInt();
		System.out.println("입력시간");
		int c = sc.nextInt();
		sc.close();
		
		if(a<23 && b+c<60) {
			System.out.println(a + ":" + (b+c));
		}else if(a<23 && b+c==60) {
			System.out.println((a+1) + ":" + "00");
		}else if(a<23 && b+c>60) {
			System.out.println((a+((b+c)/60)) + ":" + ((b+c)%60));
		}else if(a==23 && b+c<60) {
			System.out.println(a + ":" + (b+c));
		}else if(a==23 && b+c==60) {
			System.out.println('0' + ":" + "00");
		}else if(a==23 && b+c>60) {
			System.out.println((((b+c)/60)-1) + ":" + ((b+c)%60));
		}
	}

}
