import java.util.Scanner;
public class TestDemo{
	public static int sum(int n){
		if(n<10){
			return n;
		}
		int sum=n%10;
sum+=sum(n/10);
return sum;
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();

        System.out.println(sum(n));
	}
	}