import java.util.Random;
import java.util.Scanner;
public class TestDemo{
	public static void main(String[] args) {
		Random random=new Random();
		int rand=random.nextInt(100)+1; 
Scanner scan=new Scanner(System.in);
while(true){
	System.out.println("请输入你猜的数字:");
	int num=scan.nextInt();
	if(num<rand){
	System.out.println("猜小了");
}
	else if(num==rand){
		System.out.println("正确");
	}
	else{
		System.out.println("猜大了");
	}
	}
}

}
