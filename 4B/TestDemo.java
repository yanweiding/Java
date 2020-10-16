import java.util.Scanner;
public class TestDemo{
	public static int fib(int n){
		int f1=1;
		int f2=1;
		int f3=1;
		for(int i=3;i<=n;i++){
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		return f3;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(fib(n));
	}
}