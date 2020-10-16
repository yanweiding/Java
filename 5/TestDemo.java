import java.util.Arrays;
public class TestDemo{
	public static int[] transform(int []array){
int[]tmp=new int[array.length];
for(int i=0;i<array.length;i++){
	tmp[i]=array[i];
	}
	for(int i=0;i<tmp.length;i++){
	tmp[i]=tmp[i]*2;
}
return tmp;
}


		
	public static void main(String[] args) {
		int []arr={1,2,3};
		int[]ret=transform(arr);
        System.out.println(Arrays.toString(ret));
	}
}