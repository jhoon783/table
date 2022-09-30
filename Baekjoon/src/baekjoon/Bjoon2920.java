package baekjoon;

import java.util.Scanner;

public class Bjoon2920 {

	public static void main(String[] args) {
		int A[] = new int[8];
		int counta=0, countb=0;
		Scanner scan = new Scanner(System.in);

		for(int i = 0; i<8; i++) {
			int num = scan.nextInt();
			A[i]=num;
		}

		for(int i = 1; i < 8; i++) {
			if(A[i] > A[i-1]) {
				counta++;
			}if(A[i-1] > A[i]) {
				countb++;
			}
		}
		if(counta == 7)
		System.out.println("acending");
		else if(countb == 7)
			System.out.println("decending");
		else System.out.println("mixed");
		
		scan.close();
	}
}