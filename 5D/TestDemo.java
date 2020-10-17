public class TestDemo {
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int biosearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
                if (array[mid] > key) {
                    right = mid - 1;
                } else if( array[mid] < key) {
                    left = mid + 1;
                }
        else{
                    return mid;
                }
            }
        return -1;
        }

        public static void main (String[]args){
            int[] arr = {1, 2, 3, 6};
            System.out.println(biosearch(arr, 7));
        }

}