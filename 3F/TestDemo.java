public class TestDemo{
	public static void main(String[] args) {
		int i=1;
		int num=1;
		int sum=0;
		while(i<=5){
			num=num*i;
			i++;
			sum=sum+num;
		}
		System.out.println(sum);
		System.out.println(num);
	}
}
