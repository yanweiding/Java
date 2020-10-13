import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-10-13
 * Time: 18:25
 */

public class TestDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);   //从键盘获取数据
        int num=scan.nextInt();//读入一个数据
        if(num%2==0){
            System.out.println("偶数");}
            else {
                System.out.println("奇数");
            }
        }

    }

