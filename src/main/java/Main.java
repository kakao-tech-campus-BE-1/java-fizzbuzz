public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    static String fizzbuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        else return null;
    }
}