package basic;

import java.util.Scanner;

public class CodeUp1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CodeUp1541 m=new CodeUp1541();
		int n=sc.nextInt();
		m.f(n);

	}
	void f(int n) {
		
		if(n<0) {
			System.out.println("negative");
		}
		else if(n==0) {
			System.out.println("zero");
		}else if(n>0) {
			System.out.println("positive");
		}
		
	}

}
