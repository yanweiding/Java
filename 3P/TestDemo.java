import java.util.Scanner;
public class TestDemo{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("请输入密码：");
            String password=scan.nextLine();
            if(password.equals("1234")){
                System.out.println("登陆成功");
                break;
            }
            else{
                System.out.println("登陆失败");
                System.out.println("你还有"+(3-i)+"次机会");
            }
            if(i==3){
                System.out.println("机会已用完");
            }
        }
    }
}