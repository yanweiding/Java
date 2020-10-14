import java.util.Scanner;
public class TestDemo{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	while(a%b!=0){
		int m=a%b;
		a=b;
		b=m;
	}	
System.out.println(b);
	}
}
