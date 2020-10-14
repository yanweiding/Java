
import java.util.Scanner;
public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num<=0){
            System.out.println(num+"不是素数");
            return;
        }
        int j=2;
        for(;j<=Math.sqrt(num);j++) {
            if (num % j == 0) {
                System.out.println(num + "不是素数");
                break;
            }
        }
            if(j>Math.sqrt(num)){
                System.out.println(num+"是素数");
            }
        }
    }
