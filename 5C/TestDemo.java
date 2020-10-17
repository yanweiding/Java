public class TestDemo {
    public static double avg(int[] array){
        double avg=0.0;
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
            avg=sum*1.0/array.length;  
        }
        return avg;
    }

    public static void main(String[] args) {
      int[] arr={1,3,6};
        System.out.println(avg(arr));
    }
}
