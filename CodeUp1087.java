package basic;

import java.util.Scanner;

public class CodeUp1087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for (int i = 0; i <= n; i++) {
			sum+=i;
			if(sum>=n) {
				break;
			}
		}
		System.out.println(sum);
	}

}
