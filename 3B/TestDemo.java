public class TestDemo{
	public static void main(String[] args) {
        int i = 2;
        int sumEve = 0;
        while (i <= 100) {
            sumEve = sumEve + i;
            i+=2;
        }
        System.out.println("1-100偶数和为" + sumEve);
    }
}
