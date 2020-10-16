import java.util.Scanner;
public class TestDemo{
    public static int sum(int n){
       
if(n==1){
    return 1;
}
 int sum=0;
        return n+sum(n-1);
    }
    

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(sum(n));
    }
}
