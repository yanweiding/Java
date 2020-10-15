import java.util.Scanner;
public class TestDemo{
	public static int sum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=fac(i);
		}
		return sum;
	}
	public static int fac(int n){
		int a=1;
		for(int i=1;i<=n;i++){
			a=a*i;
		}
		return a;
	}


	 public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
       System.out.println(n+"的阶乘为"+fac(n));
        System.out.println("和为"+sum(n));
    }
}
