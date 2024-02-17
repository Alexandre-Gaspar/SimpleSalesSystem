public class AppTest {
    public static void main(String[] args) {
        
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int each: numbers) {
            System.out.println(each);
        }

    }
}
