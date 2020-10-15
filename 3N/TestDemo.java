import java.util.Scanner;
public class TestDemo{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();    //自己设定范围
        for(int i=1;i<=n;i++){
        	int count=0;     //位数
        int tmp=i;
         while(tmp!=0){
                tmp=tmp/10;
                count++;
            }
            tmp=i;
            int sum=0;
            while(tmp!=0){
    sum+=Math.pow(tmp%10,count);
               tmp=tmp/10;
            }
             if(sum==i)
        System.out.println(n+"以内"+i+"自幂数");
        }
          
    }
}
