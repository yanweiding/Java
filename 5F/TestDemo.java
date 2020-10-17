import java.util.Arrays;
public class TestDemo{
	public static void bubblesort(int[]array){
		boolean flag=false;  //默认没发生交换
		for(int j=0;j<array.length-1;j++){
			 flag=false;   //每一趟都有可能没有交换
			for(int i=0;i<array.length-1-j;i++){
			if(array[i]>array[i+1]){
				int tmp=array[i];
				array[i]=array[i+1];
				array[i+1]=tmp;
				  flag=true;
			}
			}if(flag==false){
    break;
}

		}
	}
	public static void main(String[] args) {
		int[]arr={2,1,8,4,5};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}
}