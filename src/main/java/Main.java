public class Main {

    public static void main(String[] args) {
      
        for (int i = 1; i < 101; i++) {
            // TODO : implement the logic
        }
    }

    static String fizzbuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        else return null;
    }
}