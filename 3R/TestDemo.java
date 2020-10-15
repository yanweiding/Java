import java.util.Scanner;
public  class TestDemo{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("奇数位：");
		for(int i=30;i>=0;i-=2){
			System.out.print(((n>>i)&1)+" ");
		}
		System.out.println();
		System.out.println("偶数位：");
		for(int i=31;i>=1;i-=2){
			System.out.print(((n>>i)&1)+" ");
		}
	}
}
