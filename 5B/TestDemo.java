public class TestDemo{
	public static int max(int []array){
		if(array==null||array.length==0){
			return 1;
		}
		int max=array[0];
		for(int i=1;i<array.length;i++){
			if (max<array[i]){
				max=array[i];
}
		}
return max;
	}

	public static void main(String[] args) {
int[]arr={1,2,3};
System.out.println(max(arr));
	}
}