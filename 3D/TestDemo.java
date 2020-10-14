public class TestDemo {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 100) {
            if (num % 15 != 0) {
                num++; // 这里的 ++ 不要忘记! 否则会死循环
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}