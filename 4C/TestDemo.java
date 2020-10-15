public class TestDemo{
	public static int fac(int n){
		if(n==1){
			return 1;
		}
		int tmp=n*fac(n-1);
		return tmp;

		}
		public static void main(String[] args) {
			System.out.println(fac(5));
		}
	}
