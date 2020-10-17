public class TestDemo{
	public static boolean issorted(int[]array){
		for(int i=0;i<array.length-1;i++){
			if(array[i]<array[i+1]){
				return true;
			}
		}
	return false;
	}
	public static void main(String[] args) {
		int[] arr={1,2,3};
		System.out.println(issorted(arr));
	}

}