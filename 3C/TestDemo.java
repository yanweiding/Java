
		import java.util.Scanner;
public class TestDemo{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int i=1;
		int fac=1;
		int sum=0;
		while(i<=num){
			fac=fac*i;
			i++;
			sum=sum+fac;
		}
		System.out.println(sum);
		System.out.println(fac);
	}
}
