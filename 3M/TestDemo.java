public class TestDemo{
    public static void main(String[] args) {
        for(int i=1;i<=999;i++){
            int m=i/100;
            int n=(i/10)%10;
            int p=i%10;
            if(i==n*n*n+m*m*m+p*p*p){
                System.out.println(i);
            }
        }
    }
}