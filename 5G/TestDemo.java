import java.util.Arrays;
public class TestDemo{
    public static void reverse(int[]array) {
            int left=0;
            int right=array.length-1;
            while(left<right){
                int tmp=array[left];
            array[left]=array[right];
            array[right]=tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[]arr={2,1,8,4,5,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}