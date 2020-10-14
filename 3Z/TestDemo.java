public class TestDemo{
	public static void main(String[] args) {
		int count=0;
		for(int i=2;i<=100;i++){
			int j=2;
			for (;j<=Math.sqrt(i);j++ ) {
				if(i%j==0){
					break;
				}
			}
			if(j>Math.sqrt(i))   //j已经到了跳出循环的大小
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("1-100素数个数为"+count);
	}
}
