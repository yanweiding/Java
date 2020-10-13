public class TestDemo {
    public static void main(String[] args) {
        int i = 1;
        int sumOdd = 0;
        while (i <= 100) {
            sumOdd = sumOdd + i;
            i+=2;
        }
        System.out.println("1-100奇数和为" + sumOdd);
    }
}
