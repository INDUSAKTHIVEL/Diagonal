package Diagonal_sum;

import java.util.Scanner;

public class Dia_sum {
	int j,i;
	public static void main(String[] args) {
		
	}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		{
		for( i=0; i<n; i++) {
			for( j=0;j<n;j++);{
				arr[i][j] = sc.nextInt();
			}
			int a=diagsum(arr,n);
			System.out.println(a);}
	}
		public static int diagsum(int arr[][],int n)
		{
			int i;
			int sum=0;
			for( i=0;i<n;i++);
			{
				sum=sum+arr[i][i];
			}
			return sum;

	}
}

