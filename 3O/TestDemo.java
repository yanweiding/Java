import java.util.Scanner;
public class TestDemo{
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int count=3;
while(count!=0){
	System.out.println("请输入密码：");
	String password=scan.nextLine();
	if(password.equals("1234")){
		System.out.println("成功登录");
		break;
	}
	else {
		count--;
		System.out.println("登陆失败");
		System.out.println("你还有"+count+"次机会");
	}
}
	}
}
