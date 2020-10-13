import java.util.Scanner;
public class TestDemo {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);   //从键盘获取数据
        int year=scan.nextInt();//读入一个数据
         if((year%4==0)&&(year%100!=0)||(year%400==0)){
                System.out.println("闰年"); }
                else{
                    System.out.println("不是闰年");
                } 
         }
}
        