import java.util.Scanner;
public class TestDemo{
	public static int fib(int n){
		if(n==1||n==2){
			return 1;
		}
		int tmp=fib(n-1)+fib(n-2);
		return tmp;
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(fib(n));
	}
}