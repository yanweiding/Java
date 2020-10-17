import java.util.Arrays;
public class TestDemo{
    public static void swap(int[]array) {
int left=0;
int right=array.length-1;
while(left<right){
    while(left<right&&array[left]%2!=0){
        left++;
    }
    while(left<right&&array[right]%2==0){
        right--;
    }
   if(left<right){
        int tmp=array[left];
        array[left]=array[right];
        array[right]=tmp;
    }
}

    }

    public static void main(String[] args) {
        int[]arr={2,1,8,4,5,7};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
