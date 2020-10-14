public class TestDemo{
	public static void main(String[] args) {
		double sum=0;
		
		int flg=1;
		for(int i=1;i<=100;i++){
			double m=1.0/i;
			sum=sum+m*flg;
			flg=-flg;
		}
		System.out.println(sum);
	}
}
