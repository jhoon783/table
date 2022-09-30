package baekjoon;

import java.util.Scanner;

public class Bjoon2798 {

	public static void main(String[] args) {
		int A[]=new int[100];
		int N,M;
		int sum=0;
		int max=0;

		Scanner scan=new Scanner(System.in);

		N=scan.nextInt();
		M=scan.nextInt();

		for(int i = 0; i<N; i++) {	
			int n=scan.nextInt();
			A[i]=n;
		}
		/*for(int i = 0; i<N; i++) {
			System.out.print(A[i]);
		}*/

		for(int i = 0; i<N; i++) {
			for(int j = i+1; j<N; j++) {
				for(int k = j+1; k<N; k++) {
					sum = A[i]+A[j]+A[k];
					if(sum <= M && max < sum) 
						max = sum;
				}
			}
		}
		System.out.print(max);
	}
}
