package Testing;

import java.util.Scanner;
public class Calculator {
	/*public int fact(int a) {
		int f=1;
		for(int i=1;i<=a;i++)
			f=f*i;
		return f;
	}*/
	
	public boolean prime(int a) {
		if(a==0||a==1)
			return false;
		else {
		for(int i=2;i<=a/2;i++) {
			if(a%2==0) {
				return false;
			}
		}
		}
		return true;
	}
	public static  int add(int a,int b) {
		return a+b;
	}
	
	public static int sub(int x, int y) {
		return x-y;
	}
// changes done by Vipul
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Calculator c=new Calculator();
		int fact=c.fact(a);
		System.out.println(fact);
	}*/
}
