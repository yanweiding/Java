import java.util.Scanner;
public class TestDemo{
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int count=0;
while(n!=0){
    count++;
    n=n&(n-1);
}
        System.out.println(count);
    }
}
