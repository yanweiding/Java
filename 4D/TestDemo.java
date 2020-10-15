import java.util.Scanner;
public class TestDemo{
public static void print(int n){
	if(n<10){
		System.out.print(n+" ");
		return;
	}
	print(n/10);
	System.out.print(n%10+" ");
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	print(n);
}
}