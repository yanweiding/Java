public class TestDemo{
	public static int FindTwomax(int a,int b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}

	public static int FindThreemax(int a,int b,int c){
		int max1=FindTwomax(a,b);
		int max2=FindTwomax(max1,c);
		return max2;
	}
	public static void main(String[] args) {
		int a=15;
		int b=20;
		System.out.println(FindTwomax(a,b));
		System.out.println(FindThreemax(10,20,30));
	}
}
