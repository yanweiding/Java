public class TestDemo{
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++){
			if(i%10==9){
				count++;
			}
			if(i/10==9){
				count++;
			}
		}
		System.out.println(count);

	}
}
