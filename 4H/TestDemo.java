import java.util.Scanner;
public class TestDemo{
public static void move(char sta,char end ){
        System.out.print(sta+"->"+end+" ");
    }

public static void Hanoi(int n,char sta,char tra,char end){
    if(n==1){
        move(sta,end);
        return;
    }
    Hanoi(n-1,sta ,end,tra);
    move(sta,end);
    Hanoi(n-1,tra,sta,end);

}
public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    int n=scan.nextInt();
    Hanoi(n, 'A','B', 'C');
}
}